import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public class Cube implements GLEventListener{
	float x, y, z;
	float tx, ty, tz;
	float theta = 0;
	float rotationAngle;
	
	
	
	public Cube(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override //affichage a chaque tour de boucle (dessin)
	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
        update(drawable);
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
        
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);

        gl.glLoadIdentity();
        
        // Handle depth
        gl.glEnable(gl.GL_DEPTH_TEST);
        
        // Push current matrix stack
        gl.glPushMatrix();
        
        // First rotation - angle and vector
        gl.glRotatef(rotationAngle, 0.0f, -1.0f, 0.0f);
        
        gl.glBegin(gl.GL_QUADS);
        
        //phase front
        gl.glColor3f(1.0f, 0.6f, 0.5f);
        gl.glVertex3f(-x, -y, -z);
        gl.glVertex3f( x, -y, -z);
        gl.glVertex3f( x,  y, -z);
        gl.glVertex3f(-x,  y, -z);
        
        //phase back
        gl.glColor3f(0f, 1f, 0.5f);
        gl.glVertex3f(-x, -y, z);
        gl.glVertex3f( x, -y, z);
        gl.glVertex3f( x,  y, z);
        gl.glVertex3f(-x,  y, z);
        
        //phase down
        gl.glColor3f(1.0f, 0.5f, 0.0f);
        gl.glVertex3f( x, -y,  z);
        gl.glVertex3f(-x, -y,  z);
        gl.glVertex3f(-x, -y, -z);
        gl.glVertex3f( x, -y, -z);
        
        //phase top
        gl.glColor3f(0.0f, 1.0f, 0.0f);
        gl.glVertex3f( x, y, -z);
        gl.glVertex3f(-x, y, -z);
        gl.glVertex3f(-x, y,  z);
        gl.glVertex3f( x, y,  z);
        
        //phase de droite
        gl.glColor3f(1.0f, 0.0f, 0.5f);
        gl.glVertex3f( x,  y, -z);
        gl.glVertex3f( x,  y,  z);
        gl.glVertex3f( x, -y,  z);
        gl.glVertex3f( x, -y, -z);
        
        //phase de gauche
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex3f(-x, -y,  z);
        gl.glVertex3f(-x, -y, -z);
        gl.glVertex3f(-x,  y, -z);
        gl.glVertex3f(-x,  y,  z);
        
        gl.glEnd();
        
        gl.glPopMatrix();
        
        // Reset draw color
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        
        rotationAngle += 0.9f;
        
	}
	
	private void update(GLAutoDrawable drawable){
	}
	
}