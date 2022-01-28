class Demo2112
{
	public void readFile()throws Exception{
	FileInputStream fis=new FileInputStream("C:\\Users\\anumu\\Desktop\\Alpha programing\\12Agh.java");
		int a=fis.available();
		System.out.println(a);
		for(int i=0;i<a;i++)
		{
          int b = fis.read();
          System.out.print((char)b);
		  try{
		  Thread.sleep(4000);
		  }
		  catch(Exception e){
			  System.out.println("got error");
		  }
		}
	fis.close();
	System.out.println();
	System.out.println("read is Done..................");
	
	}
	public void writeFile(String s)throws Exception{

	FileOutputStream fis=new FileOutputStream("C:\\Users\\anumu\\Desktop\\Alpha programing\\tryObjectOutput.txt");
	for (int i=0;i<s.length() ;i++ )
	{
		fis.write(s.charAt(i));
		try{
		  Thread.sleep(4000);
		  }
		  catch(Exception e){
			  System.out.println("got error");
		  }
		
	}
	System.out.println("write is Done...........");

	}
}

class TryThread1 extends Thread
{
	TryThread1(String s){
		super(s);
	}
	public void run() {
	Demo2112 d=new Demo2112();
	try{
	d.writeFile("sdfgvbbnnbbhj");
	}
	catch(Exception e){
	}
	}

}

class TryThread extends Thread
{
	TryThread(String s){
		super(s);
	}
	public void run() {
	Demo2112 d=new Demo2112();
	try{
	d.readFile();
	}
	catch(Exception e){
	}
	}

}
class Driver2112
{
	public static void main(String []args)throws Exception{
	Thread t=new Thread(new TryThread("santhsoh"));
	Thread t1=new Thread(new TryThread1("Anumula"));
	
	t1.start();
	t.start();
	
	}
}