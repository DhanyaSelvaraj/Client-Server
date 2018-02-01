import java.net.*;
import java.io.*;

	class myclient
		{
			public static void main(String args[])throws Exception
				{
					Socket s=new Socket(InetAddress.getLocalHost(),8888);

					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

					DataInputStream din=new DataInputStream(s.getInputStream());
					DataOutputStream dout=new DataOutputStream(s.getOutputStream());

					String str="",str1="";

					while(!str.equals("stop"))

					{

						str=br.readLine();
						dout.writeUTF(str);

						dout.flush();
						str1=din.readUTF();
						System.out.println("server says:"+str1);

					}

					dout.close();
					s.close();					
					
				}
		}

