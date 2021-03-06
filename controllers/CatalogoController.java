
package controllers;

import dao.AdopcionDAO;
import dao.MascotaDAO;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import dto.MascotaDTO;
import views.Catalogo;
import views.MenuAsistente;
import views.ViewAdopciones;

public class CatalogoController implements ActionListener {
    private MascotaDAO mascotaDAO;
    private Catalogo catalogo;
    private MenuAsistente menu;
    String imagePath = null;
    int pos = 0;

    public CatalogoController(MascotaDAO mascotaDAO, Catalogo catalogo, MenuAsistente menu) {
        this.mascotaDAO = mascotaDAO;
        this.catalogo = catalogo;
        this.menu = menu;
        
        this.catalogo.setSize(750, 520);
        this.menu.contentPanel.removeAll();
        this.menu.contentPanel.add(this.catalogo);
        this.menu.contentPanel.repaint();
        this.menu.lblTitle.setText("Catálogo de mascotas");
        
        this.catalogo.btnBack.addActionListener(this);
        this.catalogo.btnNext.addActionListener(this);
        this.catalogo.btnSelect.addActionListener(this);
        mostrarMascotaDisponible(pos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(catalogo.btnBack)) {
            atras();
        }
        if(e.getSource().equals(catalogo.btnNext)) {
            siguiente();

        }
        if(e.getSource().equals(catalogo.btnSelect)) {
            seleccionarMascota();
        }
    }

    private void mostrarMascotaDisponible(int pos) {
        ArrayList<MascotaDTO> mascotasDisponibles = this.mascotaDAO.getListaMascotasDisponibles();
        this.catalogo.nombre.setText(mascotasDisponibles.get(pos).getNombre());
        if(mascotasDisponibles.get(pos).getImageURL() != null) {
            this.catalogo.lblImage.setIcon(resizeImage(mascotasDisponibles.get(pos).getImageURL()));
            imagePath = mascotasDisponibles.get(pos).getImageURL();
        } else {
            this.catalogo.lblImage.setIcon(resizeImage("src/assets/no-image.png"));
        }
    }

    private void atras() {
        pos--;
        if(pos < 0) {
            pos = 0;
        }
        mostrarMascotaDisponible(pos);
    }

    private void siguiente() {
        pos++;
        if(pos >= this.mascotaDAO.getListaMascotasDisponibles().size()) {
            pos = this.mascotaDAO.getListaMascotasDisponibles().size() - 1;
        }
        mostrarMascotaDisponible(pos);
    }

    private void seleccionarMascota() {
        ViewAdopciones adopcionesView = new ViewAdopciones();
        AdopcionDAO adopcionDAO = new AdopcionDAO();
        AdopcionesController adopcionController = new AdopcionesController(adopcionDAO, adopcionesView, this.menu);
        adopcionesView.txtCodigoMascota.setText(this.mascotaDAO.getListaMascotasDisponibles().get(pos).getIdMascota()+"");
        adopcionController.mostrarMascota(adopcionesView.txtCodigoMascota.getText());
        
        this.menu.btnCatalogo.setBackground(new Color(84,56,220));
        this.menu.btnAdopciones.setBackground(new Color(255,86,201));
    }
    
    public ImageIcon resizeImage(String imagePath) {
        ImageIcon myImage = null;
        if(imagePath != null) {
            myImage = new ImageIcon(imagePath);
        }
        
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(catalogo.lblImage.getWidth(), catalogo.lblImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }
}
