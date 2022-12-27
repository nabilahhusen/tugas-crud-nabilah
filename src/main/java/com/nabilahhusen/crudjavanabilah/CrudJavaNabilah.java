package com.nabilahhusen.crudjavanabilah;
import com.nabilahhusen.crudmahasiswasederhana.views.MahasiswaFrame;
import javax.swing.SwingUtilities;

public class CrudJavaNabilah {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           
            public void run() {
                MahasiswaFrame form = new MahasiswaFrame();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
                
            }
        });
    }
}

