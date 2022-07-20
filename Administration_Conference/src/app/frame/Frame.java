package app.frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;

import com.itextpdf.text.pdf.PdfWriter;


import app.panel.login.Login;
import app.sessions.Home;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Frame extends JFrame {

	private JPanel contentPane;

	/**	try {
			InitialContext ctx=new InitialContext();
		    String appName = "";
		    String moduleName = "Ejb_Conference";
		    String distinctName = "";
		    String beanName = "SI";
		    String interfaceFullName = SessionRemote.class.getName();
		    final String jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceFullName;
			SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
		
		
		} catch (NamingException e) {
			System.out.println("cccccccccccccccaaaaaaaaaaaa");
			e.printStackTrace();
			
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1001, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setTitle("CNIA 2020");
		ImageIcon img=new ImageIcon(Home.class.getResource("/images/23.jpeg"));
		Image img1=img.getImage();
		contentPane.setLayout(null);
		this.setIconImage(img1);
		Login login = new Login();
		login.setBounds(0, 0, 1001, 643);
		contentPane.add(login);
		login.setVisible(true);
		centreWindow(this);
		/*try {
			File file=new File("attestation.pdf");
			OutputStream outputStream = 
	                new FileOutputStream("test1.pdf");
			
			InputStream input= new FileInputStream(file);
			doMerge(input,outputStream);
			
		} catch ( DocumentException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*	try {
		 PdfReader reader = new PdfReader("C:\\Users\\mehdi\\Downloads\\Documents\\programme de la conference_6.pdf");
		 PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("C:\\Users\\mehdi\\Downloads\\Documents\\test.pdf"));
		 PdfContentByte canvasBookingDate = stamper.getOverContent(1);
		 //add text "Hellow"
		 BaseFont base;
	
			base = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
			canvasBookingDate.saveState();
		 canvasBookingDate.beginText();
		 canvasBookingDate.setFontAndSize(base, 12);   
		 canvasBookingDate.moveText(80, 100);
		 canvasBookingDate.showText("Hello");
		 canvasBookingDate.moveText(50, 50);
		 //add text "How are you"
		 canvasBookingDate.showText("How are you");
		 canvasBookingDate.endText();
		 canvasBookingDate.restoreState();
	} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*try	{
			InitialContext ctx=new InitialContext();
		    String appName = "EAR_Conference";
		    String moduleName = "Ejb_Conference";
		    String distinctName = "";
		    String beanName = "SI";
		    String interfaceFullName = SessionRemote.class.getName();
		    final String jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceFullName;
			SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
			Session_speciale s=new Session_speciale("big data","hmza","assemlali","h","123456","fst","etudiant","aaaaaaaaaaaaaaaaaaaaa");
			 File image = new File("src/images/2.jpg");
			 if(image == null) System.out.println("nuuuuuuuuuuuuuuuuuuuuuuuuuul");
			 FileInputStream inputStream = new FileInputStream(image);
			byte[] pdfData=new byte[(int)  image.length()];
		     inputStream.read(pdfData);
	      s.setProfilImage(pdfData);
			proxy.ajouterSession(s);
	    	}catch (NamingException | IOException e){
			System.out.println("ccccccccccccccc");
			e.printStackTrace();
			
	    	}*/
		/*try {File f = new File("src/images/2.jpg");
	    Desktop dt = Desktop.getDesktop();
	    
			dt.open(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
	}
	 public static void generateAttestation(InputStream in, OutputStream outputStream,String nom)
	            throws DocumentException, IOException {
	        Document document = new Document();
	        PdfWriter writer = PdfWriter.getInstance(document, outputStream);
	        document.open();
	        PdfContentByte cb = writer.getDirectContent();
	        
	        
	            PdfReader reader = new PdfReader(in);
	            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
	                document.newPage();
	                //import the page from source pdf
	                PdfImportedPage page = writer.getImportedPage(reader, i);
	                ColumnText ct = new ColumnText(writer.getDirectContent());
	                ct.setSimpleColumn(174,18,300,480);
	                Font bold = new Font(FontFamily.HELVETICA, 12, Font.BOLD);
	                /*Paragraph p = new Paragraph("NAME: ", bold);
	                Paragraph p=new Paragraph("Mehdi Adnani");*/
	             Phrase pc=new Phrase(nom,bold);
	             String time=java.time.LocalDate.now().toString();
	                Phrase pt=new Phrase(time);
	                ct.addElement(pc);
	                
	                ct.go();
	                ct.setSimpleColumn(450,0,300,412);
	                ct.addElement(pt);
	                ct.go();
	                //add the page to the destination pdf
	                cb.addTemplate(page, 0, 0);
	                
	             // this are the coordinates where you want to add text
	             // if the text does not fit inside it will be cropped
	             
	            
	        }
	        
	        outputStream.flush();
	        document.close();
	        outputStream.close();
	    }
	 public static void centreWindow(Frame frame) {
		    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		    frame.setLocation(x, y);
		}
}
