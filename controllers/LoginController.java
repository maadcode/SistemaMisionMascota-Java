
package controllers;

import dao.UsuarioDAO;
import dto.UsuarioDTO;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import views.Login;

public class LoginController implements ActionListener {
    private UsuarioDAO usuarioDAO;
    private Login login;

    public LoginController(UsuarioDAO usuarioDAO, Login login) {
        this.usuarioDAO = usuarioDAO;
        this.login = login;
        this.login.setResizable(false);
        this.login.setTitle("Sistema de adopción");
        this.login.setLocationRelativeTo(null);
        
        this.login.btnLogin.addActionListener(this);
        
        paintBackground();
        resetLabels();
        
        this.login.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.login.btnLogin)) {
            resetLabels();
            String user = this.login.txtUsuario.getText();
            String password = this.login.txtPassword.getText();
            if(user.equals("")) {
                this.login.lblErrorUsername.setText("Este campo es requerido.");
            }
            if(password.equals("")) {
                this.login.lblErrorPassword.setText("Este campo es requerido.");
            }
            if(!user.equals("") && !password.equals("")) {
                if(checkLogin(user, password)) {
                    this.login.dispose();
                    if(isAdmin(user)) {
                        MenuAdministradorController menuController1 = new MenuAdministradorController();
                    } else {
                        MenuAsistenteController menuController2 = new MenuAsistenteController();
                    }
                    
                } else {
                    this.login.lblErrorPassword.setText("Usuario o contraseña incorrecto.");
                }
            }
        }
    }
    
    public void resetLabels(){
        this.login.lblErrorUsername.setText(null);
        this.login.lblErrorPassword.setText(null);
    }
    
    public void paintBackground() {
        ImageIcon wallpaper = new ImageIcon("C:\\Users\\gamer5\\Documents\\NetBeansProjects\\MisionMascota\\src\\assets\\bg.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(this.login.jLabel_wallpaper.getWidth(), this.login.jLabel_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        this.login.jLabel_wallpaper.setIcon(icono);
        this.login.repaint();
    }

    private boolean checkLogin(String user, String password) {
        UsuarioDTO usuario = this.usuarioDAO.getUsuario(user);
        if(usuario != null) {
            return usuario.getPassword().equals(password);
        } else {
            return false;
        }
    }
    
    private boolean isAdmin(String username) {
        UsuarioDTO usuario = this.usuarioDAO.getUsuario(username);
        return usuario.getRol() == 1;
    }
}
