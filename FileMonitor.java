package com.scott.code;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileMonitor {

	private File file ;
	private long countOfChar = 0;
	private long currentCountOfChar = 0;
	private RandomAccessFile fhandler;
	
	public FileMonitor(File file){
		this.file = file;
	}
	
	private void load(){
		try {
			 fhandler = new RandomAccessFile(file,"r");
			 currentCountOfChar = fhandler.length();
		} catch (IOException ignore) {			
		} finally{
		   close();	
		}
		
	}
	
	private boolean hasChanged(){
		load();
		return currentCountOfChar > countOfChar; 
	}
	
	public List<String> getLastLogEntry(){
		FileChannel inChannel = null;
		try{
	     if (hasChanged()){
		   long sizeOfChunk  = currentCountOfChar - countOfChar;
		   inChannel = fhandler.getChannel();		   
		   MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, countOfChar+1,sizeOfChunk);
		   countOfChar = currentCountOfChar;
		   return toList(buffer);
	      }		
		}catch(IOException ignore){
		}finally{
			close();
			if (inChannel!=null){
				try {
					inChannel.close();
				} catch (IOException e) {
				}
			}			
		}		
		return Collections.emptyList();
	}
		
	private List<String> toList(MappedByteBuffer buffer){
		StringBuilder line = new StringBuilder();
		ArrayList<String> stringOfList = new ArrayList<String>();
        byte [] bufferOfArray = buffer.array();
        for (byte b : bufferOfArray){
        	if (b == 10 || b == 13){
        		stringOfList.add(line.toString());
        		System.out.println(line.toString());
        		line.setLength(0);
        	}else{
        		line.append(b);
        	}
        }
        return stringOfList;
 
	}
	
	private void close(){
		if (fhandler!=null){
			try {
				fhandler.close();
			} catch (IOException ignore) {
			}
		}				
	}
	

}
