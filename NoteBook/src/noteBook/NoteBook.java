package noteBook;

import java.util.ArrayList;
import java.util.HashSet;

public class NoteBook {
	private ArrayList<String> notes=new ArrayList<String>();
    public void add(String s)
    {
    	notes.add(s);
    }
    public void add(int location,String s)
    {
    	notes.add(location,s);
    }
    public int getSize()
    {
    	return notes.size();
    	
    }
    public String getNote(int index)
    {
    	return notes.get(index);
    }
    public void removeNote(int index)
    {
    	notes.remove(index);
    }
    public String[] list()
    {   
    	String[] str=new String[notes.size()];
//    	for(int i=0;i<notes.size();i++)
//    	{
//    		str[i]=notes.get(i);
//    	}
    	notes.toArray(str);
		return str;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NoteBook nb=new NoteBook();
        nb.add("first");
        nb.add("second");
        nb.add("second");
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(1));
        nb.add(1,"welcome");
        String[] s=nb.list();
       
        for(String str:s)
        {
        	System.out.println(str);
        }
        HashSet<String> k=new HashSet<String>();
        k.add("123");
        k.add("123");
        k.add("456");
        k.add("123");
        System.out.println(k);
//        for(String d:k)
//        {
//        	System.out.println(d);
//        	
//        }
	}

}
