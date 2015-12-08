
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public class Render3D implements GLEventListener{

	@Override //affichage a chaque tour de boucle (dessin)
	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
        update();
        render(drawable);
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		
	}

	@Override //mise en place
	public void init(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int w, int h) {
		// TODO Auto-generated method stub
		
	}
	
	public void render(GLAutoDrawable drawable){
        GL2 gl = drawable.getGL().getGL2();
	}
	
	private void update(){

	}
	
}
