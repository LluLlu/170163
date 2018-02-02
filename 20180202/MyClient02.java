  import	java.io.*;
  import	java.net.*;
  import	java.util.*;
  
  class	MyClient02 {
  	public static void	main(String[]	args){
  		ServerSocket	servsock	=	null;
  		Socket	sock;
  		OutputStream	out;					
  		String	outstr;
  		int	i;
  
  		try	{
  			servsock	=	new	ServerSocket(5999,	300);
  
  			while(true)
  			{
  				sock	=	servsock.accept();		
  
  				outstr	=	"aaaaa"	+	"\n";
  
  				out	=	sock.getOutputStream();
  				for(i=0;	i<outstr.length();	i++)
  					out.write((int)	outstr.charAt(i));
  				out.write('\n');
  
  				sock.close();
  			}
  		}
  		catch	(IOException	e)	{
  			System.exit(1);
  		}
  	}
  }
  