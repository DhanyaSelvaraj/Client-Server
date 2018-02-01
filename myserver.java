import java.net.*;
import java.io.*;

	class myserver
		{
			public static void main(String args[])throws Exception
				{
					ServerSocket ss=new ServerSocket(8888);
					Socket s=ss.accept();

					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

					DataInputStream din=new DataInputStream(s.getInputStream());
					DataOutputStream dout=new DataOutputStream(s.getOutputStream());
					
					String str="",str1="";

					while(!str.equals("stop"))
					{

						str=din.readUTF();
						System.out.println("Client says:"+str);

						str1=br.readLine();
						dout.writeUTF(str1);
						dout.flush();
					}
					
					din.close();
					s.close();
					ss.close();

				}
		}

