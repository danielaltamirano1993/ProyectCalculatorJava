package proyectocalculadora;
/*public class ProyectoCalculadora {
    public static void main(String[] args) {
    }
    
}*/
import java.awt.*;
import java.awt.event.*;
import java.math.MathContext;
import javax.management.StringValueExp;
import javax.swing.*;
public class ProyectoCalculadora extends JFrame implements ActionListener
   {   
	   String tem="";
	   String texto="";
	   float b,c;
	   double con;
	   int opcion; 
	   JMenuBar contenedor;
	    JMenu ver,edicion,ayuda ;
	    JRadioButtonMenuItem radianes,centimetros;
	    JMenuItem estandar,cientifica,programador,copiar,pegar,historial,ver_ayuda,acerca_calculadora;
       JButton jButton1=new JButton("gsm");
       JButton jButton2=new JButton("exp");
       JButton jButton3=new JButton("ln");
       JButton jButton4=new JButton("sin");
       JButton  jButton5=new JButton("x^y");
       JButton jButton6=new JButton("log");
       JButton jButton7=new JButton("cos");
       JButton jButton8=new JButton("x^3");
       JButton jButton9=new JButton("n!");
       JButton jButton10=new JButton("tan");
       JButton jButton11=new JButton("x^2");
       JButton jButton12=new JButton("1/x");
       JButton jButton13=new JButton("7");
       JButton jButton14=new JButton("8");
       JButton jButton15=new JButton("9");
       JButton jButton16=new JButton("/");
       JButton jButton17=new JButton("4");
       JButton jButton18=new JButton("5");
       JButton jButton19=new JButton("6");
       JButton jButton20=new JButton("*");
       JButton jButton21=new JButton("1");
       JButton jButton22=new JButton("2");
       JButton jButton23=new JButton("3");
       JButton jButton24=new JButton("-");
       JButton jButton25=new JButton("0");
       JButton jButton26=new JButton("+/-");
       JButton jButton27=new JButton(",");
       JButton jButton28=new JButton("+");
       JButton jButton29=new JButton("=");
       JButton jButton30=new JButton("Retroceso");
       JButton jButton31=new JButton("CE");
       JButton jButton32=new JButton("C");
       JButton jButton33=new JButton("sq");
       JButton jButton34=new JButton("%");
       JButton jButton35=new JButton(".");
       
       JTextField jTextField1=new JTextField();
    // iniciar evento=new iniciar();
       public ProyectoCalculadora(String nombre)
        {
    	   super(nombre);
    	   iniciarControles();
    	   }
          public void  iniciarControles()
          {
        	  //menu ver 
        	contenedor=new JMenuBar();
              ver =new JMenu("Ver");
              edicion=new JMenu("Edicion");
              ayuda =new JMenu("Ayuda");
              //creando las item
              estandar =new JMenuItem("Estandar");
              cientifica =new JMenuItem("Cientifica");
              programador =new JMenuItem("Programador");
              copiar =new JMenuItem("Copiar Ctr+c");
              pegar =new JMenuItem("Pegar Ctr+v");
              historial =new JMenuItem("Historial");
              ver_ayuda =new JMenuItem("Ver Ayuda");
              acerca_calculadora =new JMenuItem("Acerca de Calculadora");
              //agregando
              this.setJMenuBar(contenedor);
              contenedor.add(ver);
              contenedor.add(edicion);
              contenedor.add(ayuda);
              ver.add(estandar);
              ver.add(cientifica);
              ver.add(programador);
              edicion.add(copiar);
              edicion.add(pegar);
              edicion.add(historial);
             ayuda.add(acerca_calculadora);
             ayuda.add(ver_ayuda);
             //radioButton
             radianes =new JRadioButtonMenuItem("Radianes");
             centimetros=new JRadioButtonMenuItem("Centimetros");
             radianes.setBounds(50,100,80,45);
             radianes.setBackground(Color.LIGHT_GRAY);
     	     centimetros.setBounds(150,100,90,45);
     	     centimetros.setBackground(Color.LIGHT_GRAY);                   
    	   jTextField1.setBounds(50,50,405,35); 
    	   jButton1.setBounds(50,150,60,25);
    	   jButton2.setBounds(115,150,60,25);   
    	   jButton3.setBounds(180,150,60,25);
    	   jButton4.setBounds(50,180,60,25);
    	   jButton5.setBounds(115,180,60,25);   
    	   jButton6.setBounds(180,180,60,25); 
    	   jButton7.setBounds(50,210,60,25);
    	   jButton8.setBounds(115,210,60,25);
    	   jButton9.setBounds(180,210,60,25);
    	   jButton10.setBounds(50,240,60,25);
    	   jButton11.setBounds(115,240,60,25);
    	   jButton12.setBounds(180,240,60,25); 	
    	   //button retrocesos
	
    	   jButton30.setBounds(260,95,93,25);
    	   jButton31.setBounds(356,95,50,25);
    	   jButton32.setBounds(409,95,44,25);
    	   //button numericos
    	  
    	   jButton13.setBounds(260,125,45,25);
    	   jButton14.setBounds(310,125,45,25);
    	   jButton15.setBounds(360,125,45,25);
    	   jButton16.setBounds(410,125,45,25);
    	   jButton17.setBounds(260,155,45,25);
    	   jButton18.setBounds(310,155,45,25);   
    	   jButton19.setBounds(360,155,45,25);
    	   jButton20.setBounds(410,155,45,25);
    	   jButton21.setBounds(260,185,45,25);  
    	   jButton22.setBounds(310,185,45,25);   
    	   jButton23.setBounds(360,185,45,25);
    	   jButton24.setBounds(410,185,45,25);
    	   jButton25.setBounds(260,215,45,25);   
    	   jButton26.setBounds(308,215,50,25);
    	   jButton27.setBounds(360,215,45,25);
    	   jButton28.setBounds(410,215,45,25);
    	   jButton29.setBounds(410,245,42,25);
    	   this.getContentPane().add(jTextField1);
    	   this.getContentPane().add(radianes);
           this.getContentPane().add(centimetros);
    	   this.getContentPane().add(jButton1);
    	   this.getContentPane().add(jButton2);
    	   this.getContentPane().add(jButton3);
    	   this.getContentPane().add(jButton4);
    	   this.getContentPane().add(jButton5);
    	   this.getContentPane().add(jButton6);
    	   this.getContentPane().add(jButton7);
    	   this.getContentPane().add(jButton8);
    	   this.getContentPane().add(jButton9);
    	   this.getContentPane().add(jButton10);
    	   this.getContentPane().add(jButton11);
    	   this.getContentPane().add(jButton12);
    	   this.getContentPane().add(jButton13);
    	   this.getContentPane().add(jButton14);
    	   this.getContentPane().add(jButton15);
    	   this.getContentPane().add(jButton16);
    	   this.getContentPane().add(jButton17);
    	   this.getContentPane().add(jButton18);
    	   this.getContentPane().add(jButton19);
    	   this.getContentPane().add(jButton20);
    	   this.getContentPane().add(jButton21);
    	   this.getContentPane().add(jButton22);
    	   this.getContentPane().add(jButton23);
    	   this.getContentPane().add(jButton24);
    	   this.getContentPane().add(jButton25);
    	   this.getContentPane().add(jButton26);
    	   this.getContentPane().add(jButton27);
    	   this.getContentPane().add(jButton28);
    	   this.getContentPane().add(jButton29);
    	   this.getContentPane().add(jButton30);
    	   this.getContentPane().add(jButton31);
    	   this.getContentPane().add(jButton32);
    	   this.getContentPane().add(jButton33);
    	   this.getContentPane().add(jButton34);
    	   this.getContentPane().add(jButton35);
    	   
    	   //poniendo al evento 
    	   jButton1.addActionListener(this);
           jButton2.addActionListener(this);
           jButton3.addActionListener(this);
           jButton4.addActionListener(this);
           jButton5.addActionListener(this);
           jButton6.addActionListener(this);
    	   jButton7.addActionListener(this);
           jButton8.addActionListener(this);
           jButton9.addActionListener(this);
           jButton10.addActionListener(this);
           jButton11.addActionListener(this);
           jButton12.addActionListener(this);
           jButton13.addActionListener(this);
           jButton14.addActionListener(this);
           jButton15.addActionListener(this);
           jButton16.addActionListener(this);
           jButton17.addActionListener(this);
           jButton18.addActionListener(this);
    	   jButton19.addActionListener(this);
           jButton20.addActionListener(this);
           jButton21.addActionListener(this);
           jButton22.addActionListener(this);
           jButton23.addActionListener(this);
           jButton24.addActionListener(this);
           jButton25.addActionListener(this);
           jButton26.addActionListener(this);
           jButton27.addActionListener(this);
           jButton28.addActionListener(this);
           jButton29.addActionListener(this);
           jButton30.addActionListener(this);
           jButton31.addActionListener(this);
           jButton32.addActionListener(this);
           jButton33.addActionListener(this);
           jButton35.addActionListener(this);
           ver_ayuda.addActionListener(this);
           //para los menus
           cientifica.addActionListener(this);
           estandar.addActionListener(this);
           copiar.addActionListener(this);
           pegar.addActionListener(this);    	   
    	   this.setBounds(500,100,475,335);
    	   this.setResizable(isMaximumSizeSet());//desactiva opcion maximizar
    	   this.getContentPane().setBackground(Color.LIGHT_GRAY);
    	   this.setLayout(null);
    	   this.setVisible(true);
    	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
 public static void main(String[] args) 
 {
	new ProyectoCalculadora("Calculadora");
  }
// iniciar implements ActionListener  para los eventos
  
	  public void actionPerformed(ActionEvent e)
	  {
		  jTextField1.setFocusable(isFocusable());//desactiva el cursor al ingresar un valor
		  if(e.getSource()==ProyectoCalculadora.this.jButton3)
		  { 
			b=Float.parseFloat(jTextField1.getText()); 
			jTextField1.setText("");
			jTextField1.setText(String.valueOf(Math.log(b)));//ln
			c=0;
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton4)
		  {
			b=Float.parseFloat(jTextField1.getText()); 
			con=(b*Math.PI)/180;//convercion de radianes a sexagesimales
			jTextField1.setText("");
			jTextField1.setText(String.valueOf(Math.sin(con)));
			c=0;
			con=0;
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton5)
		  {
			b=Float.parseFloat(jTextField1.getText()); 
			jTextField1.setText("");
			opcion=5;
			tem="";
		  }
		 
		  if(e.getSource()==ProyectoCalculadora.this.jButton6)
		  { 
			b=Float.parseFloat(jTextField1.getText()); 
			jTextField1.setText("");
			jTextField1.setText(String.valueOf(Math.log10(b)));
			c=0;
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton7)
		  { 
			b=Float.parseFloat(jTextField1.getText()); 
			con=(b*Math.PI)/180;
			jTextField1.setText("");
			jTextField1.setText(String.valueOf(Math.cos(con)));
			con=0;
			c=0;
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton8)
		  { 
			b=Float.parseFloat(jTextField1.getText()); 
			jTextField1.setText("");
			jTextField1.setText(String.valueOf(Math.pow(b,3)));
			c=0;
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton9)//factorial
		  { double k=1;
			b=Float.parseFloat(jTextField1.getText()); 
			jTextField1.setText("");
	         for (int i = 1; i <=b; i++) 
	         {
				k=k*i;
			}
			jTextField1.setText(String.valueOf(k));
		  }
		 
		  if(e.getSource()==ProyectoCalculadora.this.jButton10)
		  { 
			b=Float.parseFloat(jTextField1.getText()); 
			con=(b*Math.PI)/180;//convercion de grados a radianes
			jTextField1.setText("");
			jTextField1.setText(String.valueOf(Math.tan(con)));
			con=0;
			c=0;
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton11)
		  {
			b=Float.parseFloat(jTextField1.getText()); 
			jTextField1.setText("");
			jTextField1.setText(String.valueOf(Math.pow(b,2)));
			c=0;
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton12)
		  {
			b=Float.parseFloat(jTextField1.getText()); 
			jTextField1.setText("");
			if(b!=0)
			jTextField1.setText(String.valueOf(1/b));
			else
				jTextField1.setText("error");
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton13)
		  {
			  if(jTextField1.getText()=="")
			  {
				jButton13.setText(jButton13.getText());
				tem=jButton13.getText();
			  }
			  else
			  {
				  jTextField1.setText(tem+jButton13.getText());
				  tem+=jButton13.getText();
			  }
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton14)
		  {
			  if(jTextField1.getText()=="")
			  {
				jButton14.setText(jButton14.getText());
				tem=jButton14.getText();
			  }
			  else
			  {
				  jTextField1.setText(tem+jButton14.getText());
				  tem+=jButton14.getText();
			  }
		  } if(e.getSource()==ProyectoCalculadora.this.jButton15)
		  {
			  if(jTextField1.getText()=="")
			  {
				jButton15.setText(jButton15.getText());
				tem=jButton15.getText();
			  }
			  else
			  {
				  jTextField1.setText(tem+jButton15.getText());
				  tem+=jButton15.getText();
			  }
		  } if(e.getSource()==ProyectoCalculadora.this.jButton17)
		  {
			  if(jTextField1.getText()=="")
			  {
				jButton17.setText(jButton17.getText());
				tem=jButton17.getText();
			  }
			  else
			  {
				  jTextField1.setText(tem+jButton17.getText());
				  tem+=jButton17.getText();
			  }
		  } if(e.getSource()==ProyectoCalculadora.this.jButton18)
		  {
			  if(jTextField1.getText()=="")
			  {
				jButton18.setText(jButton18.getText());
				tem=jButton18.getText();
			  }
			  else
			  {
				  jTextField1.setText(tem+jButton18.getText());
				  tem+=jButton18.getText();
			  }
		  } if(e.getSource()==ProyectoCalculadora.this.jButton19)
		  {
			  if(jTextField1.getText()=="")
			  {
				jButton19.setText(jButton19.getText());
				tem=jButton19.getText();
			  }
			  else
			  {
				  jTextField1.setText(tem+jButton19.getText());
				  tem+=jButton19.getText();
			  }
				  
		  } if(e.getSource()==ProyectoCalculadora.this.jButton21)
		  {
			  if(jTextField1.getText()=="")
			  {
				jButton21.setText(jButton21.getText());
				tem=jButton21.getText();
			  }
			  else
			  {
				  jTextField1.setText(tem+jButton21.getText());
				  tem+=jButton21.getText();
			  }
		  } if(e.getSource()==ProyectoCalculadora.this.jButton22)
		  {
			  if(jTextField1.getText()=="")
			  {
				jButton22.setText(jButton22.getText());
				tem=jButton22.getText();
			  }
			  else
			  {
				  jTextField1.setText(tem+jButton22.getText());
				  tem+=jButton22.getText();
			  }
		  } if(e.getSource()==ProyectoCalculadora.this.jButton23)
		  {
			  if(jTextField1.getText()=="")
			  {
				jButton23.setText(jButton23.getText());
				tem=jButton23.getText();
			  }
			  else
			  {
				  jTextField1.setText(tem+jButton23.getText());
				  tem+=jButton23.getText();	  
			  }
		  } 
		  if(e.getSource()==ProyectoCalculadora.this.jButton25)
		  {
			  if(jTextField1.getText()=="")
			  {
				jButton25.setText(jButton25.getText());
				tem=jButton25.getText();
			  }
			  else
			  {
				  jTextField1.setText(tem+jButton25.getText());
				  tem+=jButton25.getText();
			  } 
   		  }
		  
		  if(e.getSource()==ProyectoCalculadora.this.jButton26)
		  {
			  float tem6;
			  tem6=-Float.valueOf(jTextField1.getText());
			  jTextField1.setText(String.valueOf(tem6));
			  
   		  }
		  if(e.getSource()==jButton30)//button retroceso
		  {
       		  String tem2="";
       		  for (int i = 0; i < jTextField1.getText().length()-1; i++)
       		   {
       			 
				tem2=tem2+jTextField1.getText().charAt(i);
			   }
                    
			  jTextField1.setText(tem2);
			  tem=tem2;
		    }
		  if(e.getSource()==ProyectoCalculadora.this.jButton28)//operador sumar
		  {
			
			  b=Float.parseFloat(jTextField1.getText());
	          tem=""; 
			  jTextField1.setText("");
			  opcion=1;
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton24)//operador restar
		  {
	  b=Float.parseFloat(jTextField1.getText());
	          tem=""; 
			  jTextField1.setText("");
			  opcion=2;
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton20)//operador multiplicar
		  {
			
			  b=Float.parseFloat(jTextField1.getText());
	          tem=""; 
			  jTextField1.setText("");
			  opcion=3;
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton16)//operador dividir
		  {
			
			  b=Float.parseFloat(jTextField1.getText());
	          tem=""; 
			  jTextField1.setText("");
			  opcion=4;
		  }
		  
		  if(e.getSource()==ProyectoCalculadora.this.jButton33)//operador raiz
		  {
			
			  b=Float.parseFloat(jTextField1.getText());
			  jTextField1.setText(String.valueOf(Math.sqrt(b)));
			  b=0;
		  }
		  
		  if(e.getSource()==ProyectoCalculadora.this.jButton35)//operador raiz
		  {   
			  tem=jTextField1.getText();
			 jTextField1.setText(tem+".");
			 tem+=jTextField1.getText();
			  
		  }
		  
		  if(e.getSource()==ver_ayuda || e.getSource()==acerca_calculadora)
		  {
			
			  JOptionPane.showMessageDialog(null,"Proyecto de Calculadora Cientifica Algoritmica III"+"\n"+" Autor:Alejandro Hurtado Chacñama"+"\n"+"Todos los Derechos reservados");
		  }
		  if(e.getSource()==copiar)//copiar el codigo 
		  {
			  jTextField1.copy();
		  }
		  if(e.getSource()==pegar)//pegar el codigo 
		  {
			  jTextField1.paste();
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton29)//realizando las operaciones
		  {
			  c= Float.parseFloat(jTextField1.getText());
			  switch (opcion) {
			case 1:
				jTextField1.setText("");
		          jTextField1.setText(String.valueOf(b+c));
				break;
           case 2:
        	   jTextField1.setText("");
		          jTextField1.setText(String.valueOf(b-c));
				break;
           case 3:
        	   jTextField1.setText("");
		          jTextField1.setText(String.valueOf(b*c));
	       break;
           case 4:
        	   if( c!=0)
        	   {
        	   jTextField1.setText("");
		          jTextField1.setText(String.valueOf(b/c));
        	   }
        	   else
        		   jTextField1.setText("error");
           break;
           case 5:
        	   jTextField1.setText("");
        	   jTextField1.setText(String.valueOf(Math.pow(b, c)));//x¨y
        	   break;
			default:
				jTextField1.setText("Valor no Admitido ");
			}
		  }
		   if(e.getSource()==ProyectoCalculadora.this.jButton31)//borra todos los datos de Jtexfield
		  {
			jTextField1.setText("0");	
			tem="";
			c=0;
			b=0;
			opcion=0;
			con=0;
		  }
		  if(e.getSource()==ProyectoCalculadora.this.jButton32)//borra todos los datos de Jtexfield
		  {
			jTextField1.setText("0");	
			tem="";
			c=0;
			b=0;
			opcion=0;
			con=0;
		  }
		  //aplicando la calculadora cientifica y normal
		 if(e.getSource()==estandar)
		  {
			  jButton1.setVisible(false);
			  jButton2.setVisible(false);
			  jButton3.setVisible(false);
			  jButton4.setVisible(false);
			  jButton5.setVisible(false);
			  jButton6.setVisible(false);
			  jButton7.setVisible(false);
			  jButton8.setVisible(false);
			  jButton9.setVisible(false);
			  jButton10.setVisible(false);
			  jButton11.setVisible(false);
			  jButton27.setVisible(false);
			  centimetros.setVisible(false);
			  radianes.setVisible(false);
			  this.setBounds(500,100,300,300);
			  jTextField1.setBounds(10,50,260,35);
			   jButton30.setBounds(10,90,95,25);
			   jButton31.setBounds(110,90,50,25);
			   jButton32.setBounds(165,90,50,25);
			   jButton26.setBounds(220,90,50,25);		   
			   jButton13.setBounds(10,120,45,25);
			   jButton14.setBounds(60,120,45,25);
			   jButton15.setBounds(110,120,48,25);   
			   jButton16.setBounds(165,120,50,25);
			   jButton34.setBounds(220,120,50,25);
			   
	    	   jButton17.setBounds(10,150,45,25);   
	    	   jButton18.setBounds(60,150,45,25);   
	    	   jButton19.setBounds(110,150,48,25); 
	    	   jButton20.setBounds(165,150,50,25);
	    	   jButton12.setBounds(220,150,52,25);
	    	   
	    	   jButton21.setBounds(10,180,45,25);
	    	   jButton22.setBounds(60,180,45,25);
	    	   jButton23.setBounds(110,180,48,25);
	    	   jButton24.setBounds(165,180,50,25); 
	    	   jButton33.setBounds(220,180,52,25);
	    	   
	    	   jButton25.setBounds(10,210,95,25);
	    	   jButton35.setBounds(110,210,50,25);   
	    	   jButton28.setBounds(165,210,50,25); 
	    	   jButton29.setBounds(220,210,52,25);
	    	      jButton12.setVisible(true);
				  jButton33.setVisible(true);
				  jButton34.setVisible(true); 
	     }
		 else
			 if(e.getSource()==cientifica)
			 {
				// estandar.setVisible(false);
				  jButton1.setVisible(true);
				  jButton2.setVisible(true);
				  jButton3.setVisible(true);
				  jButton4.setVisible(true);
				  jButton5.setVisible(true);
				  jButton6.setVisible(true);
				  jButton7.setVisible(true);
				  jButton8.setVisible(true);
				  jButton9.setVisible(true);
				  jButton10.setVisible(true);
				  jButton11.setVisible(true);
				  jButton12.setVisible(true);
				  jButton27.setVisible(true);
				  
				  jButton33.setVisible(false);
				  jButton34.setVisible(false);
				  
				  centimetros.setVisible(true);
				  radianes.setVisible(true);
			
				   jTextField1.setBounds(50,50,405,35);
				   jButton12.setBounds(180,240,60,25);
				   jButton13.setBounds(260,125,45,25);
		    	   jButton14.setBounds(310,125,45,25);
		    	   jButton15.setBounds(360,125,45,25);
		    	   jButton16.setBounds(410,125,45,25);
		    	   jButton17.setBounds(260,155,45,25);
		    	   jButton18.setBounds(310,155,45,25);   
		    	   jButton19.setBounds(360,155,45,25);
		    	   jButton20.setBounds(410,155,45,25);
		    	   jButton21.setBounds(260,185,45,25);  
		    	   jButton22.setBounds(310,185,45,25);   
		    	   jButton23.setBounds(360,185,45,25);
		    	   jButton24.setBounds(410,185,45,25);
		    	   jButton25.setBounds(260,215,45,25);   
		    	   jButton26.setBounds(308,215,50,25);
		    	   jButton27.setBounds(360,215,45,25);
		    	   jButton28.setBounds(410,215,45,25);
		    	   jButton29.setBounds(410,245,42,25);
		    	   jButton30.setBounds(260,95,93,25);
		    	   jButton31.setBounds(356,95,50,25);
		    	   jButton32.setBounds(409,95,44,25);
		    	   this.setBounds(500,100,475,335);	  
			 }
	  };
    };
