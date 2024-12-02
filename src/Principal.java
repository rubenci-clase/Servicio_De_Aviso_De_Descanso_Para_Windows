import java.awt.FlowLayout;
import javax.swing.*;

public class Principal {
	static int minutosEntreAvisos;
	static int duracionDescanso;
	static int cantidadDeAvisos;
	
    public static void main(String[] args) {
        if (args.length < 3) {
          	args = new String[3];
        	args[0] = "1";
        	args[1] = "1";
        	args[2] = "3";
        }

    minutosEntreAvisos = Integer.parseInt(args[0]);
    duracionDescanso = Integer.parseInt(args[1]);
    cantidadDeAvisos = Integer.parseInt(args[2]);

    
    while (cantidadDeAvisos > 0) {
    	try {
			Thread.sleep((minutosEntreAvisos)* 60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	Runnable r = new AvisoDescanso(minutosEntreAvisos, duracionDescanso);
    	Thread t = new Thread(r);
    	t.start();
    	
    	try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	try {
			Thread.sleep((duracionDescanso)* 60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		cantidadDeAvisos--;
    }
    }
}

class AvisoDescanso implements Runnable{
	
	int minutosEntreAvisos;
	int duracionDescanso;
	
	public AvisoDescanso(int minutosEntreAvisos, int duracionDescanso) {
		this.minutosEntreAvisos = minutosEntreAvisos;
		this.duracionDescanso = duracionDescanso;
	}
	
		@Override
		public void run() {
			// TODO Auto-generated method stub		
			VentanaMostrarMensaje v = new VentanaMostrarMensaje(duracionDescanso);
			while(v.isVisible()) {
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
 }
 
 class VentanaMostrarMensaje extends JFrame{
 	
 	public VentanaMostrarMensaje(int duracionDescanso) {
 		setLayout(new FlowLayout(FlowLayout.CENTER));
 		setSize(300,300);
 		add(new JLabel("Tomate un descanso de " + duracionDescanso + " minuto's"));
 		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
 		setVisible(true);
 		setLocationRelativeTo(null); 
 	}
 }

