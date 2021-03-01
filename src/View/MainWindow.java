/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

;

import View.idea.Calendario;
import com.company.ControlBotones;
import com.company.Funcionalidades;
import com.company.Persona;
import com.company.Registros;
import java.awt.Image;
import java.awt.Panel;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Karlenypc
 */


public class MainWindow extends javax.swing.JFrame {

    Registros inicio = new Registros();

    public MainWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        inicio.agregar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1_Base1 = new javax.swing.JPanel();
        jPanel2_Menu1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnPaciente1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnMedico1 = new javax.swing.JButton();
        btnRegistro1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnCita1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnProcedimiento1 = new javax.swing.JButton();
        btnClinica1 = new javax.swing.JButton();
        jPanel3_Superior1 = new javax.swing.JPanel();
        jLabel_Menu1 = new javax.swing.JLabel();
        jPanel_Central1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2_filtroMedico1 = new javax.swing.JPanel();
        jLabel_RegistroMedicos1 = new javax.swing.JLabel();
        txtEspecialidad5 = new javax.swing.JTextField();
        jLabel_filtroEspecialidad1 = new javax.swing.JLabel();
        jLabel_filtroNombre1 = new javax.swing.JLabel();
        jLabel_filtroApellido1 = new javax.swing.JLabel();
        txtnombreMedico5 = new javax.swing.JTextField();
        txtApellido5 = new javax.swing.JTextField();
        jButton_VisualizarMedico5 = new javax.swing.JButton();
        txtnombreMedico6 = new javax.swing.JTextField();
        txtnombreMedico7 = new javax.swing.JTextField();
        txtnombreMedico8 = new javax.swing.JTextField();
        txtApellido6 = new javax.swing.JTextField();
        txtApellido7 = new javax.swing.JTextField();
        txtApellido8 = new javax.swing.JTextField();
        txtEspecialidad6 = new javax.swing.JTextField();
        txtEspecialidad7 = new javax.swing.JTextField();
        txtEspecialidad8 = new javax.swing.JTextField();
        jButton_VisualizarMedico6 = new javax.swing.JButton();
        jButton_VisualizarMedico7 = new javax.swing.JButton();
        jButton_VisualizarMedico8 = new javax.swing.JButton();
        jPanel2_medico5 = new javax.swing.JPanel();
        jLabel_InfoMedica5 = new javax.swing.JLabel();
        jLabel_idioma4 = new javax.swing.JLabel();
        txtidiomas4 = new javax.swing.JTextField();
        txtCedulaMedico5 = new javax.swing.JTextField();
        txtSlogan4 = new javax.swing.JTextField();
        txtFinalizacionEstudios4 = new javax.swing.JTextField();
        txtTituloUniversitario4 = new javax.swing.JTextField();
        txtUniversidadEstudio5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel_procedimientosRealizados4 = new javax.swing.JLabel();
        txtCorreoMedico5 = new javax.swing.JTextField();
        jLabel_Afiliacion4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto4 = new javax.swing.JTextArea();
        txtNombreMedico5 = new javax.swing.JTextField();
        txtAfiliacionPerteneciente4 = new javax.swing.JTextField();
        jLabel_educacion7 = new javax.swing.JLabel();
        txtEspecialidadMedico5 = new javax.swing.JTextField();
        txtPaisUniversidad5 = new javax.swing.JTextField();
        jPanel2_medico6 = new javax.swing.JPanel();
        jLabel_InfoMedica6 = new javax.swing.JLabel();
        txtNombreMedico6 = new javax.swing.JTextField();
        txtCedulaMedico6 = new javax.swing.JTextField();
        txtCorreoMedico6 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtSlogan5 = new javax.swing.JTextField();
        jLabel_idioma5 = new javax.swing.JLabel();
        txtidiomas5 = new javax.swing.JTextField();
        jLabel_educacion8 = new javax.swing.JLabel();
        txtTituloUniversitario5 = new javax.swing.JTextField();
        txtFinalizacionEstudios5 = new javax.swing.JTextField();
        txtUniversidadEstudio6 = new javax.swing.JTextField();
        txtPaisUniversidad6 = new javax.swing.JTextField();
        txtEspecialidadMedico6 = new javax.swing.JTextField();
        jLabel_procedimientosRealizados5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto5 = new javax.swing.JTextArea();
        jLabel_Afiliacion5 = new javax.swing.JLabel();
        txtAfiliacionPerteneciente5 = new javax.swing.JTextField();
        jPanel2_medico7 = new javax.swing.JPanel();
        jLabel_InfoMedica7 = new javax.swing.JLabel();
        txtNombreMedico7 = new javax.swing.JTextField();
        txtCedulaMedico7 = new javax.swing.JTextField();
        txtCorreoMedico7 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtSlogan6 = new javax.swing.JTextField();
        jLabel_idioma6 = new javax.swing.JLabel();
        txtidiomas6 = new javax.swing.JTextField();
        jLabel_educacion9 = new javax.swing.JLabel();
        txtTituloUniversitario6 = new javax.swing.JTextField();
        txtFinalizacionEstudios6 = new javax.swing.JTextField();
        txtUniversidadEstudio7 = new javax.swing.JTextField();
        txtPaisUniversidad7 = new javax.swing.JTextField();
        txtEspecialidadMedico7 = new javax.swing.JTextField();
        jLabel_procedimientosRealizados6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto6 = new javax.swing.JTextArea();
        jLabel_Afiliacion6 = new javax.swing.JLabel();
        txtAfiliacionPerteneciente6 = new javax.swing.JTextField();
        jPanel2_medico8 = new javax.swing.JPanel();
        jLabel_InfoMedica8 = new javax.swing.JLabel();
        txtNombreMedico8 = new javax.swing.JTextField();
        txtCedulaMedico8 = new javax.swing.JTextField();
        txtCorreoMedico8 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtSlogan7 = new javax.swing.JTextField();
        jLabel_idioma7 = new javax.swing.JLabel();
        txtidiomas7 = new javax.swing.JTextField();
        jLabel_educacion10 = new javax.swing.JLabel();
        txtTituloUniversitario7 = new javax.swing.JTextField();
        txtFinalizacionEstudios7 = new javax.swing.JTextField();
        txtUniversidadEstudio8 = new javax.swing.JTextField();
        txtPaisUniversidad8 = new javax.swing.JTextField();
        txtEspecialidadMedico8 = new javax.swing.JTextField();
        jLabel_procedimientosRealizados7 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto7 = new javax.swing.JTextArea();
        jLabel_Afiliacion7 = new javax.swing.JLabel();
        txtAfiliacionPerteneciente7 = new javax.swing.JTextField();
        jPanel3_filtroClinica1 = new javax.swing.JPanel();
        jLabel_InfoMedica9 = new javax.swing.JLabel();
        jLabel_filtroNumeroClinica1 = new javax.swing.JLabel();
        txtNumeroClinica5 = new javax.swing.JTextField();
        jButton_VisualizarClinica5 = new javax.swing.JButton();
        jLabel_filtroNombreClinica1 = new javax.swing.JLabel();
        txtnombreClinica5 = new javax.swing.JTextField();
        txtnombreClinica6 = new javax.swing.JTextField();
        txtNumeroClinica6 = new javax.swing.JTextField();
        txtnombreClinica7 = new javax.swing.JTextField();
        txtNumeroClinica7 = new javax.swing.JTextField();
        txtnombreClinica8 = new javax.swing.JTextField();
        txtNumeroClinica8 = new javax.swing.JTextField();
        jButton_VisualizarClinica6 = new javax.swing.JButton();
        jButton_VisualizarClinica7 = new javax.swing.JButton();
        jButton_VisualizarClinica8 = new javax.swing.JButton();
        jPanel3_clinica5 = new javax.swing.JPanel();
        jLabel_InfoClinica5 = new javax.swing.JLabel();
        txtDistrito5 = new javax.swing.JTextField();
        txtDireccionGeneral5 = new javax.swing.JTextField();
        jLabel_infoContacto5 = new javax.swing.JLabel();
        jLabel_direccion5 = new javax.swing.JLabel();
        txtnumeroClinica5 = new javax.swing.JTextField();
        txtNombreClinica5 = new javax.swing.JTextField();
        jLabel_distrito5 = new javax.swing.JLabel();
        jLabel_provincia5 = new javax.swing.JLabel();
        jLabel_canton5 = new javax.swing.JLabel();
        txtProvincia5 = new javax.swing.JTextField();
        txtCanton5 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel3_clinica6 = new javax.swing.JPanel();
        jLabel_InfoClinica6 = new javax.swing.JLabel();
        txtNombreClinica6 = new javax.swing.JTextField();
        jLabel_infoContacto6 = new javax.swing.JLabel();
        txtnumeroClinica6 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel_direccion6 = new javax.swing.JLabel();
        txtDireccionGeneral6 = new javax.swing.JTextField();
        jLabel_provincia6 = new javax.swing.JLabel();
        txtProvincia6 = new javax.swing.JTextField();
        jLabel_canton6 = new javax.swing.JLabel();
        txtCanton6 = new javax.swing.JTextField();
        jLabel_distrito6 = new javax.swing.JLabel();
        txtDistrito6 = new javax.swing.JTextField();
        jPanel3_clinica7 = new javax.swing.JPanel();
        jLabel_InfoClinica7 = new javax.swing.JLabel();
        txtNombreClinica7 = new javax.swing.JTextField();
        jLabel_infoContacto7 = new javax.swing.JLabel();
        txtnumeroClinica7 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel_direccion7 = new javax.swing.JLabel();
        txtDireccionGeneral7 = new javax.swing.JTextField();
        jLabel_provincia7 = new javax.swing.JLabel();
        txtProvincia7 = new javax.swing.JTextField();
        jLabel_canton7 = new javax.swing.JLabel();
        txtCanton7 = new javax.swing.JTextField();
        jLabel_distrito7 = new javax.swing.JLabel();
        txtDistrito7 = new javax.swing.JTextField();
        jPanel3_clinica8 = new javax.swing.JPanel();
        jLabel_InfoClinica8 = new javax.swing.JLabel();
        txtNombreClinica8 = new javax.swing.JTextField();
        jLabel_infoContacto8 = new javax.swing.JLabel();
        txtnumeroClinica8 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel_direccion8 = new javax.swing.JLabel();
        txtDireccionGeneral8 = new javax.swing.JTextField();
        jLabel_provincia8 = new javax.swing.JLabel();
        txtProvincia8 = new javax.swing.JTextField();
        jLabel_canton8 = new javax.swing.JLabel();
        txtCanton8 = new javax.swing.JTextField();
        jLabel_distrito8 = new javax.swing.JLabel();
        txtDistrito8 = new javax.swing.JTextField();
        jPanel1_RegistroUsuarios1 = new javax.swing.JPanel();
        jLabel_InfoPersonal1 = new javax.swing.JLabel();
        jLabel_NombrePadecimiento1 = new javax.swing.JLabel();
        txtCorreoElectronico1 = new javax.swing.JTextField();
        jLabel_descripPadecimiento1 = new javax.swing.JLabel();
        txtApeliido1 = new javax.swing.JTextField();
        jLabel_cedula2 = new javax.swing.JLabel();
        txtedad1 = new javax.swing.JTextField();
        jLabel_correoElectronico2 = new javax.swing.JLabel();
        jLabel_tipoPadecimiento1 = new javax.swing.JLabel();
        jComboBox_nombrePadecimiento1 = new javax.swing.JComboBox<>();
        ibiFoto1 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtdescrptionPadecimiento1 = new javax.swing.JTextArea();
        jLabel_nombre2 = new javax.swing.JLabel();
        ConboxEleccion1 = new javax.swing.JComboBox<>();
        btnCargarFoto1 = new javax.swing.JButton();
        jLabel_nombre3 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel_cedula3 = new javax.swing.JLabel();
        txtCedula2 = new javax.swing.JTextField();
        jLabel_correoElectronico3 = new javax.swing.JLabel();
        jComboBox_tipoPadecimiento2 = new javax.swing.JComboBox<>();
        jPanel1_Base = new javax.swing.JPanel();
        jPanel2_Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMedico = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCita = new javax.swing.JButton();
        btnClinica = new javax.swing.JButton();
        jPanel3_Superior = new javax.swing.JPanel();
        jLabel_Menu = new javax.swing.JLabel();
        jPanel_Central = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2_filtroMedico = new javax.swing.JPanel();
        jLabel_RegistroMedicos = new javax.swing.JLabel();
        txtEspecialidad1 = new javax.swing.JTextField();
        jLabel_filtroEspecialidad = new javax.swing.JLabel();
        jLabel_filtroNombre = new javax.swing.JLabel();
        jLabel_filtroApellido = new javax.swing.JLabel();
        txtnombreMedico4 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        jButton_VisualizarMedico1 = new javax.swing.JButton();
        txtnombreMedico1 = new javax.swing.JTextField();
        txtnombreMedico3 = new javax.swing.JTextField();
        txtnombreMedico2 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtApellido3 = new javax.swing.JTextField();
        txtApellido4 = new javax.swing.JTextField();
        txtEspecialidad2 = new javax.swing.JTextField();
        txtEspecialidad3 = new javax.swing.JTextField();
        txtEspecialidad4 = new javax.swing.JTextField();
        jButton_VisualizarMedico2 = new javax.swing.JButton();
        jButton_VisualizarMedico3 = new javax.swing.JButton();
        jButton_VisualizarMedico4 = new javax.swing.JButton();
        jPanel2_medico1 = new javax.swing.JPanel();
        jLabel_InfoMedica = new javax.swing.JLabel();
        jLabel_idioma = new javax.swing.JLabel();
        txtidiomas = new javax.swing.JTextField();
        txtCedulaMedico1 = new javax.swing.JTextField();
        txtSlogan = new javax.swing.JTextField();
        txtFinalizacionEstudios = new javax.swing.JTextField();
        txtTituloUniversitario = new javax.swing.JTextField();
        txtUniversidadEstudio1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel_procedimientosRealizados = new javax.swing.JLabel();
        txtCorreoMedico1 = new javax.swing.JTextField();
        jLabel_Afiliacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto = new javax.swing.JTextArea();
        txtNombreMedico1 = new javax.swing.JTextField();
        txtAfiliacionPerteneciente = new javax.swing.JTextField();
        jLabel_educacion3 = new javax.swing.JLabel();
        txtEspecialidadMedico1 = new javax.swing.JTextField();
        txtPaisUniversidad1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel2_medico2 = new javax.swing.JPanel();
        jLabel_InfoMedica2 = new javax.swing.JLabel();
        txtNombreMedico2 = new javax.swing.JTextField();
        txtCedulaMedico2 = new javax.swing.JTextField();
        txtCorreoMedico2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSlogan1 = new javax.swing.JTextField();
        jLabel_idioma1 = new javax.swing.JLabel();
        txtidiomas1 = new javax.swing.JTextField();
        jLabel_educacion4 = new javax.swing.JLabel();
        txtTituloUniversitario1 = new javax.swing.JTextField();
        txtFinalizacionEstudios1 = new javax.swing.JTextField();
        txtUniversidadEstudio2 = new javax.swing.JTextField();
        txtPaisUniversidad2 = new javax.swing.JTextField();
        txtEspecialidadMedico2 = new javax.swing.JTextField();
        jLabel_procedimientosRealizados1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto1 = new javax.swing.JTextArea();
        jLabel_Afiliacion1 = new javax.swing.JLabel();
        txtAfiliacionPerteneciente1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel2_medico3 = new javax.swing.JPanel();
        jLabel_InfoMedica3 = new javax.swing.JLabel();
        txtNombreMedico3 = new javax.swing.JTextField();
        txtCedulaMedico3 = new javax.swing.JTextField();
        txtCorreoMedico3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSlogan2 = new javax.swing.JTextField();
        jLabel_idioma2 = new javax.swing.JLabel();
        txtidiomas2 = new javax.swing.JTextField();
        jLabel_educacion5 = new javax.swing.JLabel();
        txtTituloUniversitario2 = new javax.swing.JTextField();
        txtFinalizacionEstudios2 = new javax.swing.JTextField();
        txtUniversidadEstudio3 = new javax.swing.JTextField();
        txtPaisUniversidad3 = new javax.swing.JTextField();
        txtEspecialidadMedico3 = new javax.swing.JTextField();
        jLabel_procedimientosRealizados2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto2 = new javax.swing.JTextArea();
        jLabel_Afiliacion2 = new javax.swing.JLabel();
        txtAfiliacionPerteneciente2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel2_medico4 = new javax.swing.JPanel();
        jLabel_InfoMedica4 = new javax.swing.JLabel();
        txtNombreMedico4 = new javax.swing.JTextField();
        txtCedulaMedico4 = new javax.swing.JTextField();
        txtCorreoMedico4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtSlogan3 = new javax.swing.JTextField();
        jLabel_idioma3 = new javax.swing.JLabel();
        txtidiomas3 = new javax.swing.JTextField();
        jLabel_educacion6 = new javax.swing.JLabel();
        txtTituloUniversitario3 = new javax.swing.JTextField();
        txtFinalizacionEstudios3 = new javax.swing.JTextField();
        txtUniversidadEstudio4 = new javax.swing.JTextField();
        txtPaisUniversidad4 = new javax.swing.JTextField();
        txtEspecialidadMedico4 = new javax.swing.JTextField();
        jLabel_procedimientosRealizados3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto3 = new javax.swing.JTextArea();
        jLabel_Afiliacion3 = new javax.swing.JLabel();
        txtAfiliacionPerteneciente3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel3_filtroClinica = new javax.swing.JPanel();
        jLabel_InfoMedica1 = new javax.swing.JLabel();
        jLabel_filtroNumeroClinica = new javax.swing.JLabel();
        txtNumeroClinica1 = new javax.swing.JTextField();
        jButton_VisualizarClinica1 = new javax.swing.JButton();
        jLabel_filtroNombreClinica = new javax.swing.JLabel();
        txtnombreClinica1 = new javax.swing.JTextField();
        txtnombreClinica2 = new javax.swing.JTextField();
        txtNumeroClinica2 = new javax.swing.JTextField();
        txtnombreClinica3 = new javax.swing.JTextField();
        txtNumeroClinica3 = new javax.swing.JTextField();
        txtnombreClinica4 = new javax.swing.JTextField();
        txtNumeroClinica4 = new javax.swing.JTextField();
        jButton_VisualizarClinica2 = new javax.swing.JButton();
        jButton_VisualizarClinica3 = new javax.swing.JButton();
        jButton_VisualizarClinica4 = new javax.swing.JButton();
        jPanel3_clinica1 = new javax.swing.JPanel();
        jLabel_InfoClinica1 = new javax.swing.JLabel();
        txtDistrito1 = new javax.swing.JTextField();
        txtDireccionGeneral1 = new javax.swing.JTextField();
        jLabel_infoContacto1 = new javax.swing.JLabel();
        jLabel_direccion1 = new javax.swing.JLabel();
        txtnumeroClinica1 = new javax.swing.JTextField();
        txtNombreClinica1 = new javax.swing.JTextField();
        jLabel_distrito1 = new javax.swing.JLabel();
        jLabel_provincia1 = new javax.swing.JLabel();
        jLabel_canton1 = new javax.swing.JLabel();
        txtProvincia1 = new javax.swing.JTextField();
        txtCanton1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3_clinica2 = new javax.swing.JPanel();
        jLabel_InfoClinica2 = new javax.swing.JLabel();
        txtNombreClinica2 = new javax.swing.JTextField();
        jLabel_infoContacto2 = new javax.swing.JLabel();
        txtnumeroClinica2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel_direccion2 = new javax.swing.JLabel();
        txtDireccionGeneral2 = new javax.swing.JTextField();
        jLabel_provincia2 = new javax.swing.JLabel();
        txtProvincia2 = new javax.swing.JTextField();
        jLabel_canton2 = new javax.swing.JLabel();
        txtCanton2 = new javax.swing.JTextField();
        jLabel_distrito2 = new javax.swing.JLabel();
        txtDistrito2 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel3_clinica3 = new javax.swing.JPanel();
        jLabel_InfoClinica3 = new javax.swing.JLabel();
        txtNombreClinica3 = new javax.swing.JTextField();
        jLabel_infoContacto3 = new javax.swing.JLabel();
        txtnumeroClinica3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel_direccion3 = new javax.swing.JLabel();
        txtDireccionGeneral3 = new javax.swing.JTextField();
        jLabel_provincia3 = new javax.swing.JLabel();
        txtProvincia3 = new javax.swing.JTextField();
        jLabel_canton3 = new javax.swing.JLabel();
        txtCanton3 = new javax.swing.JTextField();
        jLabel_distrito3 = new javax.swing.JLabel();
        txtDistrito3 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel3_clinica4 = new javax.swing.JPanel();
        jLabel_InfoClinica4 = new javax.swing.JLabel();
        txtNombreClinica4 = new javax.swing.JTextField();
        jLabel_infoContacto4 = new javax.swing.JLabel();
        txtnumeroClinica4 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel_direccion4 = new javax.swing.JLabel();
        txtDireccionGeneral4 = new javax.swing.JTextField();
        jLabel_provincia4 = new javax.swing.JLabel();
        txtProvincia4 = new javax.swing.JTextField();
        jLabel_canton4 = new javax.swing.JLabel();
        txtCanton4 = new javax.swing.JTextField();
        jLabel_distrito4 = new javax.swing.JLabel();
        txtDistrito4 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jPanel1_RegistroUsuarios = new javax.swing.JPanel();
        jLabel_InfoPersonal = new javax.swing.JLabel();
        jLabel_NombrePadecimiento = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        jLabel_descripPadecimiento = new javax.swing.JLabel();
        txtApeliido = new javax.swing.JTextField();
        jLabel_cedula = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel_correoElectronico = new javax.swing.JLabel();
        jLabel_tipoPadecimiento = new javax.swing.JLabel();
        jComboBox_nombrePadecimiento = new javax.swing.JComboBox<>();
        ibiFoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescrptionPadecimiento = new javax.swing.JTextArea();
        jLabel_nombre = new javax.swing.JLabel();
        ConboxEleccion = new javax.swing.JComboBox<>();
        btnCargarFoto = new javax.swing.JButton();
        jLabel_nombre1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel_cedula1 = new javax.swing.JLabel();
        txtCedula1 = new javax.swing.JTextField();
        jLabel_correoElectronico1 = new javax.swing.JLabel();
        jComboBox_tipoPadecimiento1 = new javax.swing.JComboBox<>();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1_Base1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_Base1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2_Menu1.setBackground(new java.awt.Color(231, 229, 218));
        jPanel2_Menu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_google_forms_33px.png"))); // NOI18N
        jPanel2_Menu1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 40, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_medical_doctor_33px.png"))); // NOI18N
        jPanel2_Menu1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 40, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_search_property_33px.png"))); // NOI18N
        jPanel2_Menu1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 40, 40));

        btnPaciente1.setBackground(new java.awt.Color(106, 100, 90));
        btnPaciente1.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnPaciente1.setForeground(new java.awt.Color(30, 29, 26));
        btnPaciente1.setText("Pacientes");
        btnPaciente1.setBorder(null);
        btnPaciente1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPaciente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPaciente1mouseclicked(evt);
            }
        });
        btnPaciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaciente1ActionPerformed(evt);
            }
        });
        jPanel2_Menu1.add(btnPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 210, 41));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_hospital_3_33px.png"))); // NOI18N
        jPanel2_Menu1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 40, 40));

        btnMedico1.setBackground(new java.awt.Color(106, 100, 90));
        btnMedico1.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnMedico1.setForeground(new java.awt.Color(30, 29, 26));
        btnMedico1.setText("Médico");
        btnMedico1.setBorder(null);
        btnMedico1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMedico1.setRolloverEnabled(true);
        btnMedico1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMedico1mouseclicked(evt);
            }
        });
        btnMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedico1ActionPerformed(evt);
            }
        });
        jPanel2_Menu1.add(btnMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 210, 41));

        btnRegistro1.setBackground(new java.awt.Color(106, 100, 90));
        btnRegistro1.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnRegistro1.setForeground(new java.awt.Color(30, 29, 26));
        btnRegistro1.setText("Registrarse");
        btnRegistro1.setBorder(null);
        btnRegistro1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistro1mouseclicked(evt);
            }
        });
        btnRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistro1ActionPerformed(evt);
            }
        });
        jPanel2_Menu1.add(btnRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, 41));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_health_book_33px.png"))); // NOI18N
        jPanel2_Menu1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 40, 40));

        btnCita1.setBackground(new java.awt.Color(106, 100, 90));
        btnCita1.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnCita1.setForeground(new java.awt.Color(30, 29, 26));
        btnCita1.setText("Citas");
        btnCita1.setBorder(null);
        btnCita1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCita1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCita1mouseclicked(evt);
            }
        });
        btnCita1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCita1ActionPerformed(evt);
            }
        });
        jPanel2_Menu1.add(btnCita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 210, 41));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_hypertension_33px_1.png"))); // NOI18N
        jPanel2_Menu1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 40, 40));

        btnProcedimiento1.setBackground(new java.awt.Color(106, 100, 90));
        btnProcedimiento1.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnProcedimiento1.setForeground(new java.awt.Color(30, 29, 26));
        btnProcedimiento1.setText("        Padecimiento");
        btnProcedimiento1.setBorder(null);
        btnProcedimiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProcedimiento1.setRolloverEnabled(true);
        btnProcedimiento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProcedimiento1mouseclicked(evt);
            }
        });
        btnProcedimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcedimiento1ActionPerformed(evt);
            }
        });
        jPanel2_Menu1.add(btnProcedimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 210, 41));

        btnClinica1.setBackground(new java.awt.Color(106, 100, 90));
        btnClinica1.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnClinica1.setForeground(new java.awt.Color(30, 29, 26));
        btnClinica1.setText("Clínicas");
        btnClinica1.setBorder(null);
        btnClinica1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClinica1.setRolloverEnabled(true);
        btnClinica1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClinica1mouseclicked(evt);
            }
        });
        btnClinica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClinica1ActionPerformed(evt);
            }
        });
        jPanel2_Menu1.add(btnClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 210, 41));

        jPanel1_Base1.add(jPanel2_Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 580));

        jPanel3_Superior1.setBackground(new java.awt.Color(0, 10, 26));

        jLabel_Menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_menu_48px.png"))); // NOI18N
        jLabel_Menu1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel3_Superior1Layout = new javax.swing.GroupLayout(jPanel3_Superior1);
        jPanel3_Superior1.setLayout(jPanel3_Superior1Layout);
        jPanel3_Superior1Layout.setHorizontalGroup(
            jPanel3_Superior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_Superior1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(873, Short.MAX_VALUE))
        );
        jPanel3_Superior1Layout.setVerticalGroup(
            jPanel3_Superior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_Superior1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1_Base1.add(jPanel3_Superior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        jPanel_Central1.setLayout(new java.awt.CardLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel7.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel_Central1.add(jPanel7, "card5");

        jPanel8.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel8.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel_Central1.add(jPanel8, "card6");

        jPanel9.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel9.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel_Central1.add(jPanel9, "card7");

        jPanel2_filtroMedico1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_filtroMedico1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_RegistroMedicos1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_RegistroMedicos1.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_RegistroMedicos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_RegistroMedicos1.setText("REGISTRO MÉDICOS");
        jLabel_RegistroMedicos1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_RegistroMedicos1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_filtroMedico1.add(jLabel_RegistroMedicos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 230, 28));

        txtEspecialidad5.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad5.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico1.add(txtEspecialidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 130, 30));

        jLabel_filtroEspecialidad1.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroEspecialidad1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroEspecialidad1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroEspecialidad1.setText("Especialidad");
        jPanel2_filtroMedico1.add(jLabel_filtroEspecialidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 90, 30));

        jLabel_filtroNombre1.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroNombre1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroNombre1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroNombre1.setText("Nombre");
        jPanel2_filtroMedico1.add(jLabel_filtroNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 30));

        jLabel_filtroApellido1.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroApellido1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroApellido1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroApellido1.setText("Apellido");
        jPanel2_filtroMedico1.add(jLabel_filtroApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 70, 30));

        txtnombreMedico5.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico5.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreMedico5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreMedico5ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico1.add(txtnombreMedico5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 130, 30));

        txtApellido5.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido5.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido5ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico1.add(txtApellido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 130, 30));

        jButton_VisualizarMedico5.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico5.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico5.setText("Ver");
        jButton_VisualizarMedico5.setBorder(null);
        jButton_VisualizarMedico5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico5ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico1.add(jButton_VisualizarMedico5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 100, 30));

        txtnombreMedico6.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico6.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreMedico6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreMedico6ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico1.add(txtnombreMedico6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 30));

        txtnombreMedico7.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico7.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico1.add(txtnombreMedico7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 130, 30));

        txtnombreMedico8.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico8.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico1.add(txtnombreMedico8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, 30));

        txtApellido6.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido6.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico1.add(txtApellido6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 130, 30));

        txtApellido7.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido7.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico1.add(txtApellido7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 130, 30));

        txtApellido8.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido8.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido8ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico1.add(txtApellido8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 130, 30));

        txtEspecialidad6.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad6.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico1.add(txtEspecialidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 130, 30));

        txtEspecialidad7.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad7.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico1.add(txtEspecialidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 130, 30));

        txtEspecialidad8.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad8.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEspecialidad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidad8ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico1.add(txtEspecialidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 130, 30));

        jButton_VisualizarMedico6.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico6.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico6.setText("Ver");
        jButton_VisualizarMedico6.setBorder(null);
        jButton_VisualizarMedico6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico6ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico1.add(jButton_VisualizarMedico6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 100, 30));

        jButton_VisualizarMedico7.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico7.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico7.setText("Ver");
        jButton_VisualizarMedico7.setBorder(null);
        jButton_VisualizarMedico7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico7ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico1.add(jButton_VisualizarMedico7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 100, 30));

        jButton_VisualizarMedico8.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico8.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico8.setText("Ver");
        jButton_VisualizarMedico8.setBorder(null);
        jButton_VisualizarMedico8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico8ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico1.add(jButton_VisualizarMedico8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 100, 30));

        jPanel_Central1.add(jPanel2_filtroMedico1, "card8");

        jPanel2_medico5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico5.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel2_medico5.setRequestFocusEnabled(false);
        jPanel2_medico5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica5.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica5.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica5.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico5.add(jLabel_InfoMedica5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        jLabel_idioma4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma4.setText("Idiomas:");
        jPanel2_medico5.add(jLabel_idioma4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas4.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas4.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas4.setText("idioma1 - idioma2...");
        txtidiomas4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomas4ActionPerformed(evt);
            }
        });
        jPanel2_medico5.add(txtidiomas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        txtCedulaMedico5.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico5.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico5.setText("cedula");
        txtCedulaMedico5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico5ActionPerformed(evt);
            }
        });
        jPanel2_medico5.add(txtCedulaMedico5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtSlogan4.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan4.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan4.setText("\"slogan\"");
        txtSlogan4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico5.add(txtSlogan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 270, 30));

        txtFinalizacionEstudios4.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios4.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios4.setText("mes y año finalizacionEstudios");
        txtFinalizacionEstudios4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudios4ActionPerformed(evt);
            }
        });
        jPanel2_medico5.add(txtFinalizacionEstudios4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtTituloUniversitario4.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario4.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario4.setText("tituloMedico");
        txtTituloUniversitario4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitario4ActionPerformed(evt);
            }
        });
        jPanel2_medico5.add(txtTituloUniversitario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtUniversidadEstudio5.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio5.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio5.setText("universidadEstudio");
        txtUniversidadEstudio5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio5ActionPerformed(evt);
            }
        });
        jPanel2_medico5.add(txtUniversidadEstudio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("FOTO???!");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 160, 180));

        jLabel_procedimientosRealizados4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados4.setText("Procedimientos que realiza:");
        jPanel2_medico5.add(jLabel_procedimientosRealizados4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        txtCorreoMedico5.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico5.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico5.setText("correoElectronico");
        txtCorreoMedico5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico5ActionPerformed(evt);
            }
        });
        jPanel2_medico5.add(txtCorreoMedico5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel_Afiliacion4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion4.setText("Afiliación:");
        jPanel2_medico5.add(jLabel_Afiliacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 80, 30));

        jTextArea_procedimientoCosto4.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto4.setColumns(20);
        jTextArea_procedimientoCosto4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto4.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto4.setRows(5);
        jTextArea_procedimientoCosto4.setText("Nombre - Costo\nNombre - Costo\nNombre - Costo");
        jScrollPane6.setViewportView(jTextArea_procedimientoCosto4);

        jPanel2_medico5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        txtNombreMedico5.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico5.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico5.setText("nombreMedico1");
        txtNombreMedico5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico5.add(txtNombreMedico5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtAfiliacionPerteneciente4.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente4.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente4.setText("Colegio Medico Cirujanos...");
        txtAfiliacionPerteneciente4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico5.add(txtAfiliacionPerteneciente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 230, 30));

        jLabel_educacion7.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion7.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion7.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion7.setText("Educación:");
        jPanel2_medico5.add(jLabel_educacion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtEspecialidadMedico5.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico5.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico5.setText("**Especialidad** ");
        txtEspecialidadMedico5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico5.add(txtEspecialidadMedico5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        txtPaisUniversidad5.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad5.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad5.setText("paisUniversidad");
        txtPaisUniversidad5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad5ActionPerformed(evt);
            }
        });
        jPanel2_medico5.add(txtPaisUniversidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        jPanel_Central1.add(jPanel2_medico5, "card3");

        jPanel2_medico6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica6.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica6.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica6.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico6.add(jLabel_InfoMedica6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        txtNombreMedico6.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico6.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico6.setText("nombreMedico2");
        txtNombreMedico6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico6.add(txtNombreMedico6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtCedulaMedico6.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico6.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico6.setText("cedula");
        txtCedulaMedico6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico6ActionPerformed(evt);
            }
        });
        jPanel2_medico6.add(txtCedulaMedico6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtCorreoMedico6.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico6.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico6.setText("correoElectronico");
        txtCorreoMedico6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico6ActionPerformed(evt);
            }
        });
        jPanel2_medico6.add(txtCorreoMedico6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("FOTO???!");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 160, 180));

        txtSlogan5.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan5.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan5.setText("\"slogan\"");
        txtSlogan5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico6.add(txtSlogan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 270, 30));

        jLabel_idioma5.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma5.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma5.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma5.setText("Idiomas:");
        jPanel2_medico6.add(jLabel_idioma5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas5.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas5.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas5.setText("idioma1 - idioma2...");
        txtidiomas5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomas5ActionPerformed(evt);
            }
        });
        jPanel2_medico6.add(txtidiomas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        jLabel_educacion8.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion8.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion8.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion8.setText("Educación:");
        jPanel2_medico6.add(jLabel_educacion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtTituloUniversitario5.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario5.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario5.setText("tituloMedico");
        txtTituloUniversitario5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitario5ActionPerformed(evt);
            }
        });
        jPanel2_medico6.add(txtTituloUniversitario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtFinalizacionEstudios5.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios5.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios5.setText("mes y año finalizacionEstudios");
        txtFinalizacionEstudios5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudios5ActionPerformed(evt);
            }
        });
        jPanel2_medico6.add(txtFinalizacionEstudios5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtUniversidadEstudio6.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio6.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio6.setText("universidadEstudio");
        txtUniversidadEstudio6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio6ActionPerformed(evt);
            }
        });
        jPanel2_medico6.add(txtUniversidadEstudio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        txtPaisUniversidad6.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad6.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad6.setText("paisUniversidad");
        txtPaisUniversidad6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad6ActionPerformed(evt);
            }
        });
        jPanel2_medico6.add(txtPaisUniversidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        txtEspecialidadMedico6.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico6.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico6.setText("**Especialidad** ");
        txtEspecialidadMedico6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico6.add(txtEspecialidadMedico6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        jLabel_procedimientosRealizados5.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados5.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados5.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados5.setText("Procedimientos que realiza:");
        jPanel2_medico6.add(jLabel_procedimientosRealizados5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        jTextArea_procedimientoCosto5.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto5.setColumns(20);
        jTextArea_procedimientoCosto5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto5.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto5.setRows(5);
        jTextArea_procedimientoCosto5.setText("Nombre - Costo\nNombre - Costo\nNombre - Costo");
        jScrollPane7.setViewportView(jTextArea_procedimientoCosto5);

        jPanel2_medico6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        jLabel_Afiliacion5.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion5.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion5.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion5.setText("Afiliación:");
        jPanel2_medico6.add(jLabel_Afiliacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 80, 30));

        txtAfiliacionPerteneciente5.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente5.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente5.setText("Colegio Medico Cirujanos...");
        txtAfiliacionPerteneciente5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico6.add(txtAfiliacionPerteneciente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 230, 30));

        jPanel_Central1.add(jPanel2_medico6, "card9");

        jPanel2_medico7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica7.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica7.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica7.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico7.add(jLabel_InfoMedica7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        txtNombreMedico7.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico7.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico7.setText("nombreMedico3");
        txtNombreMedico7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico7.add(txtNombreMedico7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtCedulaMedico7.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico7.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico7.setText("cedula");
        txtCedulaMedico7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico7ActionPerformed(evt);
            }
        });
        jPanel2_medico7.add(txtCedulaMedico7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtCorreoMedico7.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico7.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico7.setText("correoElectronico");
        txtCorreoMedico7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico7ActionPerformed(evt);
            }
        });
        jPanel2_medico7.add(txtCorreoMedico7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("FOTO???!");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 160, 180));

        txtSlogan6.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan6.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan6.setText("\"slogan\"");
        txtSlogan6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico7.add(txtSlogan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 270, 30));

        jLabel_idioma6.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma6.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma6.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma6.setText("Idiomas:");
        jPanel2_medico7.add(jLabel_idioma6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas6.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas6.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas6.setText("idioma1 - idioma2...");
        txtidiomas6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomas6ActionPerformed(evt);
            }
        });
        jPanel2_medico7.add(txtidiomas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        jLabel_educacion9.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion9.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion9.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion9.setText("Educación:");
        jPanel2_medico7.add(jLabel_educacion9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtTituloUniversitario6.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario6.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario6.setText("tituloMedico");
        txtTituloUniversitario6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitario6ActionPerformed(evt);
            }
        });
        jPanel2_medico7.add(txtTituloUniversitario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtFinalizacionEstudios6.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios6.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios6.setText("mes y año finalizacionEstudios");
        txtFinalizacionEstudios6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudios6ActionPerformed(evt);
            }
        });
        jPanel2_medico7.add(txtFinalizacionEstudios6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtUniversidadEstudio7.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio7.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio7.setText("universidadEstudio");
        txtUniversidadEstudio7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio7ActionPerformed(evt);
            }
        });
        jPanel2_medico7.add(txtUniversidadEstudio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        txtPaisUniversidad7.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad7.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad7.setText("paisUniversidad");
        txtPaisUniversidad7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad7ActionPerformed(evt);
            }
        });
        jPanel2_medico7.add(txtPaisUniversidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        txtEspecialidadMedico7.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico7.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico7.setText("**Especialidad** ");
        txtEspecialidadMedico7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico7.add(txtEspecialidadMedico7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        jLabel_procedimientosRealizados6.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados6.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados6.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados6.setText("Procedimientos que realiza:");
        jPanel2_medico7.add(jLabel_procedimientosRealizados6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        jTextArea_procedimientoCosto6.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto6.setColumns(20);
        jTextArea_procedimientoCosto6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto6.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto6.setRows(5);
        jTextArea_procedimientoCosto6.setText("Nombre - Costo\nNombre - Costo\nNombre - Costo");
        jScrollPane8.setViewportView(jTextArea_procedimientoCosto6);

        jPanel2_medico7.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        jLabel_Afiliacion6.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion6.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion6.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion6.setText("Afiliación:");
        jPanel2_medico7.add(jLabel_Afiliacion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 80, 30));

        txtAfiliacionPerteneciente6.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente6.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente6.setText("Colegio Medico Cirujanos...");
        txtAfiliacionPerteneciente6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico7.add(txtAfiliacionPerteneciente6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 230, 30));

        jPanel_Central1.add(jPanel2_medico7, "card10");

        jPanel2_medico8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica8.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica8.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica8.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico8.add(jLabel_InfoMedica8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        txtNombreMedico8.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico8.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico8.setText("nombreMedico4");
        txtNombreMedico8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico8.add(txtNombreMedico8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtCedulaMedico8.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico8.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico8.setText("cedula");
        txtCedulaMedico8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico8ActionPerformed(evt);
            }
        });
        jPanel2_medico8.add(txtCedulaMedico8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtCorreoMedico8.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico8.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico8.setText("correoElectronico");
        txtCorreoMedico8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico8ActionPerformed(evt);
            }
        });
        jPanel2_medico8.add(txtCorreoMedico8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("FOTO???!");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 160, 180));

        txtSlogan7.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan7.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan7.setText("\"slogan\"");
        txtSlogan7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico8.add(txtSlogan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 270, 30));

        jLabel_idioma7.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma7.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma7.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma7.setText("Idiomas:");
        jPanel2_medico8.add(jLabel_idioma7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas7.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas7.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas7.setText("idioma1 - idioma2...");
        txtidiomas7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomas7ActionPerformed(evt);
            }
        });
        jPanel2_medico8.add(txtidiomas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        jLabel_educacion10.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion10.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion10.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion10.setText("Educación:");
        jPanel2_medico8.add(jLabel_educacion10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtTituloUniversitario7.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario7.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario7.setText("tituloMedico");
        txtTituloUniversitario7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitario7ActionPerformed(evt);
            }
        });
        jPanel2_medico8.add(txtTituloUniversitario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtFinalizacionEstudios7.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios7.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios7.setText("mes y año finalizacionEstudios");
        txtFinalizacionEstudios7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudios7ActionPerformed(evt);
            }
        });
        jPanel2_medico8.add(txtFinalizacionEstudios7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtUniversidadEstudio8.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio8.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio8.setText("universidadEstudio");
        txtUniversidadEstudio8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio8ActionPerformed(evt);
            }
        });
        jPanel2_medico8.add(txtUniversidadEstudio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        txtPaisUniversidad8.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad8.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad8.setText("paisUniversidad");
        txtPaisUniversidad8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad8ActionPerformed(evt);
            }
        });
        jPanel2_medico8.add(txtPaisUniversidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        txtEspecialidadMedico8.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico8.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico8.setText("**Especialidad** ");
        txtEspecialidadMedico8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico8.add(txtEspecialidadMedico8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        jLabel_procedimientosRealizados7.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados7.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados7.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados7.setText("Procedimientos que realiza:");
        jPanel2_medico8.add(jLabel_procedimientosRealizados7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        jTextArea_procedimientoCosto7.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto7.setColumns(20);
        jTextArea_procedimientoCosto7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto7.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto7.setRows(5);
        jTextArea_procedimientoCosto7.setText("Nombre - Costo\nNombre - Costo\nNombre - Costo");
        jScrollPane9.setViewportView(jTextArea_procedimientoCosto7);

        jPanel2_medico8.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        jLabel_Afiliacion7.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion7.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion7.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion7.setText("Afiliación:");
        jPanel2_medico8.add(jLabel_Afiliacion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 80, 30));

        txtAfiliacionPerteneciente7.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente7.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente7.setText("Colegio Medico Cirujanos...");
        txtAfiliacionPerteneciente7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico8.add(txtAfiliacionPerteneciente7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 230, 30));

        jPanel_Central1.add(jPanel2_medico8, "card11");

        jPanel3_filtroClinica1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_filtroClinica1.setForeground(new java.awt.Color(255, 255, 204));
        jPanel3_filtroClinica1.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel3_filtroClinica1.setRequestFocusEnabled(false);
        jPanel3_filtroClinica1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica9.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica9.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica9.setText("REGISTRO CLÍNICA");
        jLabel_InfoMedica9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_filtroClinica1.add(jLabel_InfoMedica9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 28));

        jLabel_filtroNumeroClinica1.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroNumeroClinica1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroNumeroClinica1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroNumeroClinica1.setText("Número Clínica:");
        jPanel3_filtroClinica1.add(jLabel_filtroNumeroClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 120, 30));

        txtNumeroClinica5.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica5.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica5ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(txtNumeroClinica5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 130, 30));

        jButton_VisualizarClinica5.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica5.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica5.setText("Ver");
        jButton_VisualizarClinica5.setBorder(null);
        jButton_VisualizarClinica5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica5ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(jButton_VisualizarClinica5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 100, 30));

        jLabel_filtroNombreClinica1.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroNombreClinica1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroNombreClinica1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroNombreClinica1.setText("Nombre Clínica:");
        jPanel3_filtroClinica1.add(jLabel_filtroNombreClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 30));

        txtnombreClinica5.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica5.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica5ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(txtnombreClinica5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 200, 30));

        txtnombreClinica6.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica6.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica6ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(txtnombreClinica6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, 30));

        txtNumeroClinica6.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica6.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica6ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(txtNumeroClinica6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 130, 30));

        txtnombreClinica7.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica7.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica7ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(txtnombreClinica7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 200, 30));

        txtNumeroClinica7.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica7.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica7ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(txtNumeroClinica7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 130, 30));

        txtnombreClinica8.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica8.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica8ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(txtnombreClinica8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 30));

        txtNumeroClinica8.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica8.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica8ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(txtNumeroClinica8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 130, 30));

        jButton_VisualizarClinica6.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica6.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica6.setText("Ver");
        jButton_VisualizarClinica6.setBorder(null);
        jButton_VisualizarClinica6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica6ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(jButton_VisualizarClinica6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 100, 30));

        jButton_VisualizarClinica7.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica7.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica7.setText("Ver");
        jButton_VisualizarClinica7.setBorder(null);
        jButton_VisualizarClinica7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica7ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(jButton_VisualizarClinica7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 100, 30));

        jButton_VisualizarClinica8.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica8.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica8.setText("Ver");
        jButton_VisualizarClinica8.setBorder(null);
        jButton_VisualizarClinica8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica8ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica1.add(jButton_VisualizarClinica8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 100, 30));

        jPanel_Central1.add(jPanel3_filtroClinica1, "card4");

        jPanel3_clinica5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica5.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica5.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica5.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica5.add(jLabel_InfoClinica5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtDistrito5.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito5.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica5.add(txtDistrito5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 170, 30));

        txtDireccionGeneral5.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral5.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral5.setText("direccionGeneral");
        txtDireccionGeneral5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica5.add(txtDireccionGeneral5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 340, 30));

        jLabel_infoContacto5.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto5.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto5.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto5.setText("Información de Contacto:");
        jPanel3_clinica5.add(jLabel_infoContacto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        jLabel_direccion5.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion5.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion5.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion5.setText("Dirección:");
        jPanel3_clinica5.add(jLabel_direccion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 30));

        txtnumeroClinica5.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica5.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica5.setText("NumeroClinica");
        txtnumeroClinica5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica5.add(txtnumeroClinica5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 30));

        txtNombreClinica5.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica5.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica5.setText("**NombreClinica1**");
        txtNombreClinica5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica5.add(txtNombreClinica5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        jLabel_distrito5.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito5.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito5.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito5.setText("Distrito:");
        jPanel3_clinica5.add(jLabel_distrito5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 80, 30));

        jLabel_provincia5.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia5.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia5.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia5.setText("Provincia:");
        jPanel3_clinica5.add(jLabel_provincia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, 30));

        jLabel_canton5.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton5.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton5.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton5.setText("Canton:");
        jPanel3_clinica5.add(jLabel_canton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 80, 30));

        txtProvincia5.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia5.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica5.add(txtProvincia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 30));

        txtCanton5.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton5.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica5.add(txtCanton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 170, 30));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("FOTO???!");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, 180));

        jPanel_Central1.add(jPanel3_clinica5, "card12");

        jPanel3_clinica6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica6.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica6.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica6.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica6.add(jLabel_InfoClinica6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtNombreClinica6.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica6.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica6.setText("**NombreClinica2**");
        txtNombreClinica6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica6.add(txtNombreClinica6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        jLabel_infoContacto6.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto6.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto6.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto6.setText("Información de Contacto:");
        jPanel3_clinica6.add(jLabel_infoContacto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        txtnumeroClinica6.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica6.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica6.setText("NumeroClinica");
        txtnumeroClinica6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica6.add(txtnumeroClinica6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 30));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("FOTO???!");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, 180));

        jLabel_direccion6.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion6.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion6.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion6.setText("Dirección:");
        jPanel3_clinica6.add(jLabel_direccion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 30));

        txtDireccionGeneral6.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral6.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral6.setText("direccionGeneral");
        txtDireccionGeneral6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica6.add(txtDireccionGeneral6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 340, 30));

        jLabel_provincia6.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia6.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia6.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia6.setText("Provincia:");
        jPanel3_clinica6.add(jLabel_provincia6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, 30));

        txtProvincia6.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia6.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica6.add(txtProvincia6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 30));

        jLabel_canton6.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton6.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton6.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton6.setText("Canton:");
        jPanel3_clinica6.add(jLabel_canton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 80, 30));

        txtCanton6.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton6.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica6.add(txtCanton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 170, 30));

        jLabel_distrito6.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito6.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito6.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito6.setText("Distrito:");
        jPanel3_clinica6.add(jLabel_distrito6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 80, 30));

        txtDistrito6.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito6.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica6.add(txtDistrito6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 170, 30));

        jPanel_Central1.add(jPanel3_clinica6, "card13");

        jPanel3_clinica7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica7.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica7.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica7.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica7.add(jLabel_InfoClinica7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtNombreClinica7.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica7.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica7.setText("**NombreClinica3**");
        txtNombreClinica7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica7.add(txtNombreClinica7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        jLabel_infoContacto7.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto7.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto7.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto7.setText("Información de Contacto:");
        jPanel3_clinica7.add(jLabel_infoContacto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        txtnumeroClinica7.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica7.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica7.setText("NumeroClinica");
        txtnumeroClinica7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica7.add(txtnumeroClinica7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 30));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("FOTO???!");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, 180));

        jLabel_direccion7.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion7.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion7.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion7.setText("Dirección:");
        jPanel3_clinica7.add(jLabel_direccion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 30));

        txtDireccionGeneral7.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral7.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral7.setText("direccionGeneral");
        txtDireccionGeneral7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica7.add(txtDireccionGeneral7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 340, 30));

        jLabel_provincia7.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia7.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia7.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia7.setText("Provincia:");
        jPanel3_clinica7.add(jLabel_provincia7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, 30));

        txtProvincia7.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia7.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica7.add(txtProvincia7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 30));

        jLabel_canton7.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton7.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton7.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton7.setText("Canton:");
        jPanel3_clinica7.add(jLabel_canton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 80, 30));

        txtCanton7.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton7.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica7.add(txtCanton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 170, 30));

        jLabel_distrito7.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito7.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito7.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito7.setText("Distrito:");
        jPanel3_clinica7.add(jLabel_distrito7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 80, 30));

        txtDistrito7.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito7.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica7.add(txtDistrito7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 170, 30));

        jPanel_Central1.add(jPanel3_clinica7, "card14");

        jPanel3_clinica8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica8.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica8.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica8.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica8.add(jLabel_InfoClinica8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtNombreClinica8.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica8.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica8.setText("**NombreClinica4**");
        txtNombreClinica8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica8.add(txtNombreClinica8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        jLabel_infoContacto8.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto8.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto8.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto8.setText("Información de Contacto:");
        jPanel3_clinica8.add(jLabel_infoContacto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        txtnumeroClinica8.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica8.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica8.setText("NumeroClinica");
        txtnumeroClinica8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica8.add(txtnumeroClinica8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 30));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("FOTO???!");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, 180));

        jLabel_direccion8.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion8.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion8.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion8.setText("Dirección:");
        jPanel3_clinica8.add(jLabel_direccion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 30));

        txtDireccionGeneral8.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral8.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral8.setText("direccionGeneral");
        txtDireccionGeneral8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica8.add(txtDireccionGeneral8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 340, 30));

        jLabel_provincia8.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia8.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia8.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia8.setText("Provincia:");
        jPanel3_clinica8.add(jLabel_provincia8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, 30));

        txtProvincia8.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia8.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica8.add(txtProvincia8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 30));

        jLabel_canton8.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton8.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton8.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton8.setText("Canton:");
        jPanel3_clinica8.add(jLabel_canton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 80, 30));

        txtCanton8.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton8.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica8.add(txtCanton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 170, 30));

        jLabel_distrito8.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito8.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito8.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito8.setText("Distrito:");
        jPanel3_clinica8.add(jLabel_distrito8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 80, 30));

        txtDistrito8.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito8.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica8.add(txtDistrito8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 170, 30));

        jPanel_Central1.add(jPanel3_clinica8, "card15");

        jPanel1_RegistroUsuarios1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_RegistroUsuarios1.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel1_RegistroUsuarios1.setRequestFocusEnabled(false);
        jPanel1_RegistroUsuarios1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoPersonal1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoPersonal1.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoPersonal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoPersonal1.setText("INFORMACIÓN PERSONAL");
        jLabel_InfoPersonal1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoPersonal1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1_RegistroUsuarios1.add(jLabel_InfoPersonal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        jLabel_NombrePadecimiento1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_NombrePadecimiento1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_NombrePadecimiento1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_NombrePadecimiento1.setText("Nombre Padecimiento:");
        jPanel1_RegistroUsuarios1.add(jLabel_NombrePadecimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 160, 30));

        txtCorreoElectronico1.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoElectronico1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoElectronico1.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoElectronico1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoElectronico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronico1ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios1.add(txtCorreoElectronico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 230, 30));

        jLabel_descripPadecimiento1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_descripPadecimiento1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_descripPadecimiento1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_descripPadecimiento1.setText("Descripción Padecimiento:");
        jPanel1_RegistroUsuarios1.add(jLabel_descripPadecimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 190, 30));

        txtApeliido1.setBackground(new java.awt.Color(231, 229, 218));
        txtApeliido1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApeliido1.setForeground(new java.awt.Color(30, 29, 26));
        txtApeliido1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1_RegistroUsuarios1.add(txtApeliido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel_cedula2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_cedula2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_cedula2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_cedula2.setText("Edad:");
        jPanel1_RegistroUsuarios1.add(jLabel_cedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 30));

        txtedad1.setBackground(new java.awt.Color(231, 229, 218));
        txtedad1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtedad1.setForeground(new java.awt.Color(30, 29, 26));
        txtedad1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtedad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedad1ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios1.add(txtedad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 30));

        jLabel_correoElectronico2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_correoElectronico2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_correoElectronico2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_correoElectronico2.setText("¿Sufre algun padecimiento?");
        jPanel1_RegistroUsuarios1.add(jLabel_correoElectronico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 190, 30));

        jLabel_tipoPadecimiento1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_tipoPadecimiento1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_tipoPadecimiento1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_tipoPadecimiento1.setText("Tipo Padecimiento:");
        jPanel1_RegistroUsuarios1.add(jLabel_tipoPadecimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 140, 30));

        jComboBox_nombrePadecimiento1.setBackground(new java.awt.Color(231, 229, 218));
        jComboBox_nombrePadecimiento1.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        jComboBox_nombrePadecimiento1.setForeground(new java.awt.Color(30, 29, 26));
        jComboBox_nombrePadecimiento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" }));
        jComboBox_nombrePadecimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_nombrePadecimiento1ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios1.add(jComboBox_nombrePadecimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 230, 30));

        ibiFoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibiFoto1.setText("FOTO");
        ibiFoto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1_RegistroUsuarios1.add(ibiFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 230, 260));

        txtdescrptionPadecimiento1.setBackground(new java.awt.Color(231, 229, 218));
        txtdescrptionPadecimiento1.setColumns(20);
        txtdescrptionPadecimiento1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txtdescrptionPadecimiento1.setForeground(new java.awt.Color(30, 29, 26));
        txtdescrptionPadecimiento1.setRows(5);
        jScrollPane10.setViewportView(txtdescrptionPadecimiento1);

        jPanel1_RegistroUsuarios1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 240, 90));

        jLabel_nombre2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_nombre2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_nombre2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_nombre2.setText("Apeliido:");
        jPanel1_RegistroUsuarios1.add(jLabel_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));

        ConboxEleccion1.setBackground(new java.awt.Color(231, 229, 218));
        ConboxEleccion1.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        ConboxEleccion1.setForeground(new java.awt.Color(30, 29, 26));
        ConboxEleccion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        ConboxEleccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConboxEleccion1ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios1.add(ConboxEleccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 30));

        btnCargarFoto1.setText("Cargar Foto ");
        btnCargarFoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarFoto1ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios1.add(btnCargarFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 120, 30));

        jLabel_nombre3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_nombre3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_nombre3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_nombre3.setText("Nombre:");
        jPanel1_RegistroUsuarios1.add(jLabel_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 30));

        txtNombre1.setBackground(new java.awt.Color(231, 229, 218));
        txtNombre1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(30, 29, 26));
        txtNombre1.setToolTipText("");
        txtNombre1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNombre1.setDropMode(javax.swing.DropMode.INSERT);
        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 230, 30));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel_cedula3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_cedula3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_cedula3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_cedula3.setText("Cédula:");
        jPanel1_RegistroUsuarios1.add(jLabel_cedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));

        txtCedula2.setBackground(new java.awt.Color(231, 229, 218));
        txtCedula2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedula2.setForeground(new java.awt.Color(30, 29, 26));
        txtCedula2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1_RegistroUsuarios1.add(txtCedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 230, 30));

        jLabel_correoElectronico3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_correoElectronico3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_correoElectronico3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_correoElectronico3.setText("Correo Electrónico:");
        jPanel1_RegistroUsuarios1.add(jLabel_correoElectronico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 140, 30));

        jComboBox_tipoPadecimiento2.setBackground(new java.awt.Color(231, 229, 218));
        jComboBox_tipoPadecimiento2.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        jComboBox_tipoPadecimiento2.setForeground(new java.awt.Color(30, 29, 26));
        jComboBox_tipoPadecimiento2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" }));
        jComboBox_tipoPadecimiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_tipoPadecimiento2ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios1.add(jComboBox_tipoPadecimiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 230, 30));

        jPanel_Central1.add(jPanel1_RegistroUsuarios1, "card2");

        jPanel1_Base1.add(jPanel_Central1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 700, 580));

        jFrame1.getContentPane().add(jPanel1_Base1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 904, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1_Base.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_Base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2_Menu.setBackground(new java.awt.Color(231, 229, 218));
        jPanel2_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_google_forms_33px.png"))); // NOI18N
        jPanel2_Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 40, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_medical_doctor_33px.png"))); // NOI18N
        jPanel2_Menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_hospital_3_33px.png"))); // NOI18N
        jPanel2_Menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 40, 40));

        btnMedico.setBackground(new java.awt.Color(106, 100, 90));
        btnMedico.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnMedico.setForeground(new java.awt.Color(30, 29, 26));
        btnMedico.setText("Médico");
        btnMedico.setBorder(null);
        btnMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMedico.setRolloverEnabled(true);
        btnMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
        });
        btnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicoActionPerformed(evt);
            }
        });
        jPanel2_Menu.add(btnMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 210, 41));

        btnRegistro.setBackground(new java.awt.Color(106, 100, 90));
        btnRegistro.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(30, 29, 26));
        btnRegistro.setText("Registrarse");
        btnRegistro.setBorder(null);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
        });
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel2_Menu.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 210, 41));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_health_book_33px.png"))); // NOI18N
        jPanel2_Menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 40, 40));

        btnCita.setBackground(new java.awt.Color(106, 100, 90));
        btnCita.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnCita.setForeground(new java.awt.Color(30, 29, 26));
        btnCita.setText("Citas");
        btnCita.setBorder(null);
        btnCita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
        });
        btnCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaActionPerformed(evt);
            }
        });
        jPanel2_Menu.add(btnCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 210, 41));

        btnClinica.setBackground(new java.awt.Color(106, 100, 90));
        btnClinica.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnClinica.setForeground(new java.awt.Color(30, 29, 26));
        btnClinica.setText("Clínicas");
        btnClinica.setBorder(null);
        btnClinica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClinica.setRolloverEnabled(true);
        btnClinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
        });
        btnClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClinicaActionPerformed(evt);
            }
        });
        jPanel2_Menu.add(btnClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 210, 41));

        jPanel1_Base.add(jPanel2_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 580));

        jPanel3_Superior.setBackground(new java.awt.Color(0, 10, 26));

        jLabel_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_menu_48px.png"))); // NOI18N
        jLabel_Menu.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel3_SuperiorLayout = new javax.swing.GroupLayout(jPanel3_Superior);
        jPanel3_Superior.setLayout(jPanel3_SuperiorLayout);
        jPanel3_SuperiorLayout.setHorizontalGroup(
            jPanel3_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(873, Short.MAX_VALUE))
        );
        jPanel3_SuperiorLayout.setVerticalGroup(
            jPanel3_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1_Base.add(jPanel3_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        jPanel_Central.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel4.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel_Central.add(jPanel4, "card5");

        jPanel5.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel5.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel_Central.add(jPanel5, "card6");

        jPanel6.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel6.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel_Central.add(jPanel6, "card7");

        jPanel2_filtroMedico.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_filtroMedico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_RegistroMedicos.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_RegistroMedicos.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_RegistroMedicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_RegistroMedicos.setText("REGISTRO MÉDICOS");
        jLabel_RegistroMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_RegistroMedicos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_filtroMedico.add(jLabel_RegistroMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 230, 28));

        txtEspecialidad1.setEditable(false);
        txtEspecialidad1.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad1.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad1.setText("CARDIOLOGIA");
        txtEspecialidad1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtEspecialidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 130, 30));

        jLabel_filtroEspecialidad.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroEspecialidad.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroEspecialidad.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroEspecialidad.setText("Especialidad");
        jPanel2_filtroMedico.add(jLabel_filtroEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 90, 30));

        jLabel_filtroNombre.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroNombre.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroNombre.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroNombre.setText("Nombre");
        jPanel2_filtroMedico.add(jLabel_filtroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 30));

        jLabel_filtroApellido.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroApellido.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroApellido.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroApellido.setText("Apellido");
        jPanel2_filtroMedico.add(jLabel_filtroApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 70, 30));

        txtnombreMedico4.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico4.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico4.setText("LUCAS");
        txtnombreMedico4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreMedico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreMedico4ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(txtnombreMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 130, 30));

        txtApellido1.setEditable(false);
        txtApellido1.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido1.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido1.setText("MARTINEZ");
        txtApellido1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 130, 30));

        jButton_VisualizarMedico1.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico1.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico1.setText("Ver");
        jButton_VisualizarMedico1.setBorder(null);
        jButton_VisualizarMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico1ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(jButton_VisualizarMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 100, 30));

        txtnombreMedico1.setEditable(false);
        txtnombreMedico1.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico1.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico1.setText("FRANSICO");
        txtnombreMedico1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreMedico1ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(txtnombreMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 30));

        txtnombreMedico3.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico3.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico3.setText("ETHAN");
        txtnombreMedico3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtnombreMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 130, 30));

        txtnombreMedico2.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico2.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico2.setText("SHANNEN");
        txtnombreMedico2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtnombreMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, 30));

        txtApellido2.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido2.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido2.setText("RETANA ");
        txtApellido2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 130, 30));

        txtApellido3.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido3.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido3.setText("ACKERMAN");
        txtApellido3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtApellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 130, 30));

        txtApellido4.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido4.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido4.setText("DIAZ");
        txtApellido4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido4ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(txtApellido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 130, 30));

        txtEspecialidad2.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad2.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad2.setText("MEDICINA GENERAL");
        txtEspecialidad2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtEspecialidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 130, 30));

        txtEspecialidad3.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad3.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad3.setText("NUTRICIONISTA");
        txtEspecialidad3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtEspecialidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 130, 30));

        txtEspecialidad4.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad4.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad4.setText("DERMATOLOGIA");
        txtEspecialidad4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEspecialidad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidad4ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(txtEspecialidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 130, 30));

        jButton_VisualizarMedico2.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico2.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico2.setText("Ver");
        jButton_VisualizarMedico2.setBorder(null);
        jButton_VisualizarMedico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico2ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(jButton_VisualizarMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 100, 30));

        jButton_VisualizarMedico3.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico3.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico3.setText("Ver");
        jButton_VisualizarMedico3.setBorder(null);
        jButton_VisualizarMedico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico3ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(jButton_VisualizarMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 100, 30));

        jButton_VisualizarMedico4.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico4.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico4.setText("Ver");
        jButton_VisualizarMedico4.setBorder(null);
        jButton_VisualizarMedico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico4ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(jButton_VisualizarMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 100, 30));

        jPanel_Central.add(jPanel2_filtroMedico, "card8");

        jPanel2_medico1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico1.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel2_medico1.setRequestFocusEnabled(false);
        jPanel2_medico1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico1.add(jLabel_InfoMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        jLabel_idioma.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma.setText("Idiomas:");
        jPanel2_medico1.add(jLabel_idioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas.setText("ESPAÑOL");
        txtidiomas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomasActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtidiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        txtCedulaMedico1.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico1.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico1.setText("115670345");
        txtCedulaMedico1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico1ActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtCedulaMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtSlogan.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan.setText("\"SIEMPRE PENDIENTE DE SU SALUD\"");
        txtSlogan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico1.add(txtSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 270, 30));

        txtFinalizacionEstudios.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios.setText("SEPTIEMBRE -2010");
        txtFinalizacionEstudios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudiosActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtFinalizacionEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtTituloUniversitario.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario.setText("MEDICO");
        txtTituloUniversitario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitarioActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtTituloUniversitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtUniversidadEstudio1.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio1.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio1.setText("UNIVERSIDAD SANTA PAULA");
        txtUniversidadEstudio1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio1ActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtUniversidadEstudio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\pimie\\OneDrive\\Desktop\\fotosproyecto\\imagen doctor 1.png")); // NOI18N
        jLabel14.setText("FOTO???!");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 160, 180));

        jLabel_procedimientosRealizados.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados.setText("Procedimientos que realiza:");
        jPanel2_medico1.add(jLabel_procedimientosRealizados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        txtCorreoMedico1.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico1.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico1.setText("fjavier@gmail.com");
        txtCorreoMedico1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico1ActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtCorreoMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel_Afiliacion.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion.setText("Afiliación:");
        jPanel2_medico1.add(jLabel_Afiliacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 80, 30));

        jTextArea_procedimientoCosto.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto.setColumns(20);
        jTextArea_procedimientoCosto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto.setRows(5);
        jTextArea_procedimientoCosto.setText("- ELECTROCARDIOGRAMA \n- RESONANCIA MAGNETICA\n- ECOCARDIOGRAMA\n-RADIOGRAFIA DE PECHO");
        jScrollPane2.setViewportView(jTextArea_procedimientoCosto);

        jPanel2_medico1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        txtNombreMedico1.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico1.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico1.setText("FRANCISCO JAVIER MARTINEZ DIAZ");
        txtNombreMedico1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico1.add(txtNombreMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtAfiliacionPerteneciente.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente.setText("COLEGIO DE MEDICOS Y CIRUJANOS COSTA RICA");
        txtAfiliacionPerteneciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico1.add(txtAfiliacionPerteneciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 310, 30));

        jLabel_educacion3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion3.setText("Educación:");
        jPanel2_medico1.add(jLabel_educacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtEspecialidadMedico1.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico1.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico1.setText("CARDIOLOGO");
        txtEspecialidadMedico1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico1.add(txtEspecialidadMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        txtPaisUniversidad1.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad1.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad1.setText("COSTA RICA");
        txtPaisUniversidad1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad1ActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtPaisUniversidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("Calificar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jButton18.setText("Enviar Correo");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jPanel_Central.add(jPanel2_medico1, "card3");

        jPanel2_medico2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica2.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica2.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica2.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico2.add(jLabel_InfoMedica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        txtNombreMedico2.setEditable(false);
        txtNombreMedico2.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico2.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico2.setText("SHANNEN FABIOLA RETANA NUÑEZ");
        txtNombreMedico2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico2.add(txtNombreMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtCedulaMedico2.setEditable(false);
        txtCedulaMedico2.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico2.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico2.setText("115200145728");
        txtCedulaMedico2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico2ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtCedulaMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtCorreoMedico2.setEditable(false);
        txtCorreoMedico2.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico2.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico2.setText("shannen.retana.nunez@gmail.com");
        txtCorreoMedico2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico2ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtCorreoMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\pimie\\OneDrive\\Desktop\\fotosproyecto\\imagen doctor 2.png")); // NOI18N
        jLabel15.setText("FOTO???!");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 170, 180));

        txtSlogan1.setEditable(false);
        txtSlogan1.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan1.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan1.setText("\"MEJOR PREVENIR, QUE LUEGO LAMENTAR\"");
        txtSlogan1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico2.add(txtSlogan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 270, 30));

        jLabel_idioma1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma1.setText("Idiomas:");
        jPanel2_medico2.add(jLabel_idioma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas1.setEditable(false);
        txtidiomas1.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas1.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas1.setText("ESPAÑOL - INGLES - PORTUGUES");
        txtidiomas1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomas1ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtidiomas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        jLabel_educacion4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion4.setText("Educación:");
        jPanel2_medico2.add(jLabel_educacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtTituloUniversitario1.setEditable(false);
        txtTituloUniversitario1.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario1.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario1.setText("MEDICO CIRUJANO");
        txtTituloUniversitario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitario1ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtTituloUniversitario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtFinalizacionEstudios1.setEditable(false);
        txtFinalizacionEstudios1.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios1.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios1.setText("FEBRERO - 2018");
        txtFinalizacionEstudios1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudios1ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtFinalizacionEstudios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtUniversidadEstudio2.setEditable(false);
        txtUniversidadEstudio2.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio2.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio2.setText("UNIVERSIDAD DE COSTA RICA");
        txtUniversidadEstudio2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio2ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtUniversidadEstudio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        txtPaisUniversidad2.setEditable(false);
        txtPaisUniversidad2.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad2.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad2.setText("COSTA RICA");
        txtPaisUniversidad2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad2ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtPaisUniversidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        txtEspecialidadMedico2.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico2.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico2.setText("**Especialidad** ");
        txtEspecialidadMedico2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico2.add(txtEspecialidadMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        jLabel_procedimientosRealizados1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados1.setText("Procedimientos que realiza:");
        jPanel2_medico2.add(jLabel_procedimientosRealizados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        jTextArea_procedimientoCosto1.setEditable(false);
        jTextArea_procedimientoCosto1.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto1.setColumns(20);
        jTextArea_procedimientoCosto1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto1.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto1.setRows(5);
        jTextArea_procedimientoCosto1.setText("- HEMOGRAMA COMPLETO\n- URINALISIS \n- EXAMEN DE SANGRE");
        jScrollPane3.setViewportView(jTextArea_procedimientoCosto1);

        jPanel2_medico2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        jLabel_Afiliacion1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion1.setText("Afiliación:");
        jPanel2_medico2.add(jLabel_Afiliacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 80, 30));

        txtAfiliacionPerteneciente1.setEditable(false);
        txtAfiliacionPerteneciente1.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente1.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente1.setText("COLEGIO DE MEDICOS Y CIRUJANOS COSTA RICA");
        txtAfiliacionPerteneciente1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico2.add(txtAfiliacionPerteneciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 310, 30));

        jButton5.setText("Atras");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        jButton12.setText("Calificar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jButton17.setText("Enviar Correo");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jPanel_Central.add(jPanel2_medico2, "card9");

        jPanel2_medico3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica3.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica3.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica3.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico3.add(jLabel_InfoMedica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        txtNombreMedico3.setEditable(false);
        txtNombreMedico3.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico3.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico3.setText("ETHAN ACKERMAN ");
        txtNombreMedico3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico3.add(txtNombreMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtCedulaMedico3.setEditable(false);
        txtCedulaMedico3.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico3.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico3.setText("115200145728");
        txtCedulaMedico3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico3ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtCedulaMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtCorreoMedico3.setEditable(false);
        txtCorreoMedico3.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico3.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico3.setText("ethan.ackerman@gmail.com");
        txtCorreoMedico3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico3ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtCorreoMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\pimie\\OneDrive\\Desktop\\fotosproyecto\\Imagen doctor 3.png")); // NOI18N
        jLabel16.setText("FOTO???!");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 150, 180));

        txtSlogan2.setEditable(false);
        txtSlogan2.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan2.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan2.setText("\"PROTEGER LO QUE COMES ES DE SABIOS\"");
        txtSlogan2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico3.add(txtSlogan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 270, 30));

        jLabel_idioma2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma2.setText("Idiomas:");
        jPanel2_medico3.add(jLabel_idioma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas2.setEditable(false);
        txtidiomas2.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas2.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas2.setText("INGLES - ESPAÑOL ");
        txtidiomas2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomas2ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtidiomas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        jLabel_educacion5.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion5.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion5.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion5.setText("Educación:");
        jPanel2_medico3.add(jLabel_educacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtTituloUniversitario2.setEditable(false);
        txtTituloUniversitario2.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario2.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario2.setText("NUTRIOLOGO");
        txtTituloUniversitario2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitario2ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtTituloUniversitario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtFinalizacionEstudios2.setEditable(false);
        txtFinalizacionEstudios2.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios2.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios2.setText("MARZO - 2015");
        txtFinalizacionEstudios2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudios2ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtFinalizacionEstudios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtUniversidadEstudio3.setEditable(false);
        txtUniversidadEstudio3.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio3.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio3.setText("BYU UNIVERTSITY");
        txtUniversidadEstudio3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio3ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtUniversidadEstudio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        txtPaisUniversidad3.setEditable(false);
        txtPaisUniversidad3.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad3.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad3.setText("ESTADOS UNIDOS");
        txtPaisUniversidad3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad3ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtPaisUniversidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        txtEspecialidadMedico3.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico3.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico3.setText("NUTRIOLOGO");
        txtEspecialidadMedico3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico3.add(txtEspecialidadMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        jLabel_procedimientosRealizados2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados2.setText("Procedimientos que realiza:");
        jPanel2_medico3.add(jLabel_procedimientosRealizados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        jTextArea_procedimientoCosto2.setEditable(false);
        jTextArea_procedimientoCosto2.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto2.setColumns(20);
        jTextArea_procedimientoCosto2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto2.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto2.setRows(5);
        jTextArea_procedimientoCosto2.setText("- RECUENTO SANGUINEO\n- MONITOREO DE TIROIDES\n- ANALISIS DE HORMONAS ");
        jScrollPane4.setViewportView(jTextArea_procedimientoCosto2);

        jPanel2_medico3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        jLabel_Afiliacion2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion2.setText("Afiliación:");
        jPanel2_medico3.add(jLabel_Afiliacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 80, 30));

        txtAfiliacionPerteneciente2.setEditable(false);
        txtAfiliacionPerteneciente2.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente2.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente2.setText("COLEGIO DE PROFESIONALES EN NUTRICION");
        txtAfiliacionPerteneciente2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico3.add(txtAfiliacionPerteneciente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 300, 30));

        jButton6.setText("Atras");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        jButton13.setText("Calificar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jButton16.setText("Enviar Correo");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jPanel_Central.add(jPanel2_medico3, "card10");

        jPanel2_medico4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica4.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica4.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica4.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico4.add(jLabel_InfoMedica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        txtNombreMedico4.setEditable(false);
        txtNombreMedico4.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico4.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico4.setText("LUCAS ANDRES DIAZ DIAZ");
        txtNombreMedico4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico4.add(txtNombreMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtCedulaMedico4.setEditable(false);
        txtCedulaMedico4.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico4.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico4.setText("115357890");
        txtCedulaMedico4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico4ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtCedulaMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtCorreoMedico4.setEditable(false);
        txtCorreoMedico4.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico4.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico4.setText("lucas.diaz@gmail.com");
        txtCorreoMedico4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico4ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtCorreoMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\pimie\\OneDrive\\Desktop\\fotosproyecto\\imagen doctor 4.png")); // NOI18N
        jLabel17.setText("FOTO???!");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 150, 180));

        txtSlogan3.setEditable(false);
        txtSlogan3.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan3.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan3.setText("\"LO EXTERIOR TAMBIEN ES IMPORTANTE\"");
        txtSlogan3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico4.add(txtSlogan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 270, 30));

        jLabel_idioma3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma3.setText("Idiomas:");
        jPanel2_medico4.add(jLabel_idioma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas3.setEditable(false);
        txtidiomas3.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas3.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas3.setText("INGLES - ESPAÑOL ");
        txtidiomas3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomas3ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtidiomas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        jLabel_educacion6.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion6.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion6.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion6.setText("Educación:");
        jPanel2_medico4.add(jLabel_educacion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtTituloUniversitario3.setEditable(false);
        txtTituloUniversitario3.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario3.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario3.setText("DERMATOLOGIA ");
        txtTituloUniversitario3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitario3ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtTituloUniversitario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtFinalizacionEstudios3.setEditable(false);
        txtFinalizacionEstudios3.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios3.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios3.setText("FEBRERO - 2018");
        txtFinalizacionEstudios3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudios3ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtFinalizacionEstudios3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtUniversidadEstudio4.setEditable(false);
        txtUniversidadEstudio4.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio4.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio4.setText("UNIVERSIDAD SANTA PAULA");
        txtUniversidadEstudio4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio4ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtUniversidadEstudio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        txtPaisUniversidad4.setEditable(false);
        txtPaisUniversidad4.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad4.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad4.setText("COSTA RICA");
        txtPaisUniversidad4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad4ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtPaisUniversidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        txtEspecialidadMedico4.setEditable(false);
        txtEspecialidadMedico4.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico4.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico4.setText("DERMATOLOGIA");
        txtEspecialidadMedico4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico4.add(txtEspecialidadMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        jLabel_procedimientosRealizados3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados3.setText("Procedimientos que realiza:");
        jPanel2_medico4.add(jLabel_procedimientosRealizados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        jTextArea_procedimientoCosto3.setEditable(false);
        jTextArea_procedimientoCosto3.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto3.setColumns(20);
        jTextArea_procedimientoCosto3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto3.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto3.setRows(5);
        jTextArea_procedimientoCosto3.setText("- TRICOGRAMA DIGITAL\n- ACARO TEST\n-BUSQUEDA DE ACARO DEMODEX");
        jScrollPane5.setViewportView(jTextArea_procedimientoCosto3);

        jPanel2_medico4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        jLabel_Afiliacion3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion3.setText("Afiliación:");
        jPanel2_medico4.add(jLabel_Afiliacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 80, 30));

        txtAfiliacionPerteneciente3.setEditable(false);
        txtAfiliacionPerteneciente3.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente3.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente3.setText("COLEGIO DE MEDICOSY CIRUJANOS COSTA RICA");
        txtAfiliacionPerteneciente3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico4.add(txtAfiliacionPerteneciente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 300, 30));

        jButton7.setText("Atras");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, -1));

        jButton14.setText("Calificar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jButton15.setText("Enviar correo");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jPanel_Central.add(jPanel2_medico4, "card11");

        jPanel3_filtroClinica.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_filtroClinica.setForeground(new java.awt.Color(255, 255, 204));
        jPanel3_filtroClinica.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel3_filtroClinica.setRequestFocusEnabled(false);
        jPanel3_filtroClinica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica1.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica1.setText("REGISTRO CLÍNICA");
        jLabel_InfoMedica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_filtroClinica.add(jLabel_InfoMedica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 28));

        jLabel_filtroNumeroClinica.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroNumeroClinica.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroNumeroClinica.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroNumeroClinica.setText("Número Clínica:");
        jPanel3_filtroClinica.add(jLabel_filtroNumeroClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 120, 30));

        txtNumeroClinica1.setEditable(false);
        txtNumeroClinica1.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica1.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica1.setText("2234-4567");
        txtNumeroClinica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica1ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtNumeroClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 130, 30));

        jButton_VisualizarClinica1.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica1.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica1.setText("Ver");
        jButton_VisualizarClinica1.setBorder(null);
        jButton_VisualizarClinica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica1ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(jButton_VisualizarClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 100, 30));

        jLabel_filtroNombreClinica.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroNombreClinica.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroNombreClinica.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroNombreClinica.setText("Nombre Clínica:");
        jPanel3_filtroClinica.add(jLabel_filtroNombreClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 30));

        txtnombreClinica1.setEditable(false);
        txtnombreClinica1.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica1.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica1.setText("CLINICA SAN JOSE");
        txtnombreClinica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica1ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtnombreClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 200, 30));

        txtnombreClinica2.setEditable(false);
        txtnombreClinica2.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica2.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica2.setText("CLINICA GRANADILLA");
        txtnombreClinica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica2ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtnombreClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, 30));

        txtNumeroClinica2.setEditable(false);
        txtNumeroClinica2.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica2.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica2.setText("2254-8899");
        txtNumeroClinica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica2ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtNumeroClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 130, 30));

        txtnombreClinica3.setEditable(false);
        txtnombreClinica3.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica3.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica3.setText("CLINICA DESAMPARADOS");
        txtnombreClinica3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica3ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtnombreClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 200, 30));

        txtNumeroClinica3.setEditable(false);
        txtNumeroClinica3.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica3.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica3.setText("22344567");
        txtNumeroClinica3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica3ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtNumeroClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 130, 30));

        txtnombreClinica4.setEditable(false);
        txtnombreClinica4.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica4.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica4.setText("CLINICA COSTA");
        txtnombreClinica4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica4ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtnombreClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 30));

        txtNumeroClinica4.setEditable(false);
        txtNumeroClinica4.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica4.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica4.setText("2244-6789");
        txtNumeroClinica4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica4ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtNumeroClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 130, 30));

        jButton_VisualizarClinica2.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica2.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica2.setText("Ver");
        jButton_VisualizarClinica2.setBorder(null);
        jButton_VisualizarClinica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica2ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(jButton_VisualizarClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 100, 30));

        jButton_VisualizarClinica3.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica3.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica3.setText("Ver");
        jButton_VisualizarClinica3.setBorder(null);
        jButton_VisualizarClinica3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica3ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(jButton_VisualizarClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 100, 30));

        jButton_VisualizarClinica4.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica4.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica4.setText("Ver");
        jButton_VisualizarClinica4.setBorder(null);
        jButton_VisualizarClinica4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica4ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(jButton_VisualizarClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 100, 30));

        jPanel_Central.add(jPanel3_filtroClinica, "card4");

        jPanel3_clinica1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica1.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica1.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica1.add(jLabel_InfoClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtDistrito1.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito1.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito1.setText("SAN JOSE");
        txtDistrito1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica1.add(txtDistrito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 80, 30));

        txtDireccionGeneral1.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral1.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral1.setText("AVENIDA #1234");
        txtDireccionGeneral1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica1.add(txtDireccionGeneral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 340, 30));

        jLabel_infoContacto1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto1.setText("Numero de Contacto:");
        jPanel3_clinica1.add(jLabel_infoContacto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        jLabel_direccion1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion1.setText("Dirección:");
        jPanel3_clinica1.add(jLabel_direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 30));

        txtnumeroClinica1.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica1.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica1.setText("2234-4567");
        txtnumeroClinica1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica1.add(txtnumeroClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 30));

        txtNombreClinica1.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica1.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica1.setText("CLINICA SAN JOSE ");
        txtNombreClinica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica1.add(txtNombreClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        jLabel_distrito1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito1.setText("Distrito:");
        jPanel3_clinica1.add(jLabel_distrito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 80, 30));

        jLabel_provincia1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia1.setText("Provincia:");
        jPanel3_clinica1.add(jLabel_provincia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 90, 30));

        jLabel_canton1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton1.setText("Canton:");
        jPanel3_clinica1.add(jLabel_canton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 80, 30));

        txtProvincia1.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia1.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia1.setText("SAN JOSE");
        txtProvincia1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica1.add(txtProvincia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 80, 30));

        txtCanton1.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton1.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton1.setText("SAN JOSE");
        txtCanton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica1.add(txtCanton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 80, 30));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\pimie\\OneDrive\\Desktop\\fotosproyecto\\CLINICA 1.png")); // NOI18N
        jLabel18.setText("FOTO???!");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 190, 180));

        jButton4.setText("Atras");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3_clinica1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jPanel_Central.add(jPanel3_clinica1, "card12");

        jPanel3_clinica2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica2.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica2.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica2.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica2.add(jLabel_InfoClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtNombreClinica2.setEditable(false);
        txtNombreClinica2.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica2.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica2.setText("CLINICA GRANADILLA ");
        txtNombreClinica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica2.add(txtNombreClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 230, 30));

        jLabel_infoContacto2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto2.setText("Numero de Contacto:");
        jPanel3_clinica2.add(jLabel_infoContacto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        txtnumeroClinica2.setEditable(false);
        txtnumeroClinica2.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica2.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica2.setText("2254-8899");
        txtnumeroClinica2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica2.add(txtnumeroClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 30));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\pimie\\OneDrive\\Desktop\\fotosproyecto\\CLINICA2.png")); // NOI18N
        jLabel19.setText("FOTO???!");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 190, 180));

        jLabel_direccion2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion2.setText("Dirección:");
        jPanel3_clinica2.add(jLabel_direccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 30));

        txtDireccionGeneral2.setEditable(false);
        txtDireccionGeneral2.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral2.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral2.setText("25 MTS NORTE,  50 MTS SUR DE LA IGLESIA CATOLICA");
        txtDireccionGeneral2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica2.add(txtDireccionGeneral2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 340, 30));

        jLabel_provincia2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia2.setText("Provincia:");
        jPanel3_clinica2.add(jLabel_provincia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 90, 30));

        txtProvincia2.setEditable(false);
        txtProvincia2.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia2.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia2.setText("CURRIDABAT");
        txtProvincia2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica2.add(txtProvincia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 90, 30));

        jLabel_canton2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton2.setText("Canton:");
        jPanel3_clinica2.add(jLabel_canton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 80, 30));

        txtCanton2.setEditable(false);
        txtCanton2.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton2.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton2.setText("GRANADILLA NORTE");
        txtCanton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica2.add(txtCanton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 130, 30));

        jLabel_distrito2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito2.setText("Distrito:");
        jPanel3_clinica2.add(jLabel_distrito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 80, 30));

        txtDistrito2.setEditable(false);
        txtDistrito2.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito2.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito2.setText("SAN JOSE");
        txtDistrito2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica2.add(txtDistrito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 80, 30));

        jButton8.setText("Atras");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3_clinica2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, -1));

        jPanel_Central.add(jPanel3_clinica2, "card13");

        jPanel3_clinica3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica3.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica3.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica3.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica3.add(jLabel_InfoClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtNombreClinica3.setEditable(false);
        txtNombreClinica3.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica3.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica3.setText("CLINICA DESAMPARADOS");
        txtNombreClinica3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica3.add(txtNombreClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, 30));

        jLabel_infoContacto3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto3.setText("Numero de Contacto:");
        jPanel3_clinica3.add(jLabel_infoContacto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        txtnumeroClinica3.setEditable(false);
        txtnumeroClinica3.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica3.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica3.setText("2234-4563");
        txtnumeroClinica3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica3.add(txtnumeroClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 30));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\pimie\\OneDrive\\Desktop\\fotosproyecto\\CLINICA 3.png")); // NOI18N
        jLabel20.setText("FOTO???!");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 190, 180));

        jLabel_direccion3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion3.setText("Dirección:");
        jPanel3_clinica3.add(jLabel_direccion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 30));

        txtDireccionGeneral3.setEditable(false);
        txtDireccionGeneral3.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral3.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral3.setText("100 MTS SUR DE MCDONALDS DEL CENTRO DE DESAMPARADOS");
        txtDireccionGeneral3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica3.add(txtDireccionGeneral3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 400, 30));

        jLabel_provincia3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia3.setText("Provincia:");
        jPanel3_clinica3.add(jLabel_provincia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 90, 30));

        txtProvincia3.setEditable(false);
        txtProvincia3.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia3.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia3.setText("DESAMPARADOS");
        txtProvincia3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica3.add(txtProvincia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 120, 30));

        jLabel_canton3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton3.setText("Canton:");
        jPanel3_clinica3.add(jLabel_canton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 80, 30));

        txtCanton3.setEditable(false);
        txtCanton3.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton3.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton3.setText("SAN ANTONIO");
        txtCanton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica3.add(txtCanton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 100, 30));

        jLabel_distrito3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito3.setText("Distrito:");
        jPanel3_clinica3.add(jLabel_distrito3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 80, 30));

        txtDistrito3.setEditable(false);
        txtDistrito3.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito3.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito3.setText("SAN JOSE");
        txtDistrito3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica3.add(txtDistrito3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 80, 30));

        jButton9.setText("Atras");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3_clinica3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        jPanel_Central.add(jPanel3_clinica3, "card14");

        jPanel3_clinica4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica4.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica4.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica4.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica4.add(jLabel_InfoClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtNombreClinica4.setEditable(false);
        txtNombreClinica4.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica4.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica4.setText("CLINICA COSTA");
        txtNombreClinica4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica4.add(txtNombreClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        jLabel_infoContacto4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto4.setText("Numero de Contacto:");
        jPanel3_clinica4.add(jLabel_infoContacto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        txtnumeroClinica4.setEditable(false);
        txtnumeroClinica4.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica4.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica4.setText("2244-6789");
        txtnumeroClinica4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica4.add(txtnumeroClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 30));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\pimie\\OneDrive\\Desktop\\fotosproyecto\\CLINICA4.png")); // NOI18N
        jLabel21.setText("FOTO???!");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 190, 180));

        jLabel_direccion4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion4.setText("Dirección:");
        jPanel3_clinica4.add(jLabel_direccion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 30));

        txtDireccionGeneral4.setEditable(false);
        txtDireccionGeneral4.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral4.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral4.setText("CALLE #12, 100 MTS DE LA IGLESIA TESTIGO DE JEHOVA");
        txtDireccionGeneral4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica4.add(txtDireccionGeneral4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 340, 30));

        jLabel_provincia4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia4.setText("Provincia:");
        jPanel3_clinica4.add(jLabel_provincia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 90, 30));

        txtProvincia4.setEditable(false);
        txtProvincia4.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia4.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia4.setText("LIBERIA");
        txtProvincia4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica4.add(txtProvincia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 100, 30));

        jLabel_canton4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton4.setText("Canton:");
        jPanel3_clinica4.add(jLabel_canton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 80, 30));

        txtCanton4.setEditable(false);
        txtCanton4.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton4.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton4.setText("GUANACASTE");
        txtCanton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica4.add(txtCanton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 100, 30));

        jLabel_distrito4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito4.setText("Distrito:");
        jPanel3_clinica4.add(jLabel_distrito4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 80, 30));

        txtDistrito4.setEditable(false);
        txtDistrito4.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito4.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito4.setText("GUANACASTE");
        txtDistrito4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica4.add(txtDistrito4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 110, 30));

        jButton10.setText("Atras");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3_clinica4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        jPanel_Central.add(jPanel3_clinica4, "card15");

        jPanel1_RegistroUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_RegistroUsuarios.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel1_RegistroUsuarios.setRequestFocusEnabled(false);
        jPanel1_RegistroUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoPersonal.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoPersonal.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoPersonal.setText("INFORMACIÓN PERSONAL");
        jLabel_InfoPersonal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoPersonal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1_RegistroUsuarios.add(jLabel_InfoPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        jLabel_NombrePadecimiento.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_NombrePadecimiento.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_NombrePadecimiento.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_NombrePadecimiento.setText("Nombre Padecimiento:");
        jPanel1_RegistroUsuarios.add(jLabel_NombrePadecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 160, 30));

        txtCorreoElectronico.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoElectronico.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoElectronico.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoElectronico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 230, 30));

        jLabel_descripPadecimiento.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_descripPadecimiento.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_descripPadecimiento.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_descripPadecimiento.setText("Descripción Padecimiento:");
        jPanel1_RegistroUsuarios.add(jLabel_descripPadecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 190, 30));

        txtApeliido.setBackground(new java.awt.Color(231, 229, 218));
        txtApeliido.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApeliido.setForeground(new java.awt.Color(30, 29, 26));
        txtApeliido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1_RegistroUsuarios.add(txtApeliido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel_cedula.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_cedula.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_cedula.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_cedula.setText("Edad:");
        jPanel1_RegistroUsuarios.add(jLabel_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 30));

        txtedad.setBackground(new java.awt.Color(231, 229, 218));
        txtedad.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtedad.setForeground(new java.awt.Color(30, 29, 26));
        txtedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 30));

        jLabel_correoElectronico.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_correoElectronico.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_correoElectronico.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_correoElectronico.setText("¿Sufre algun padecimiento?");
        jPanel1_RegistroUsuarios.add(jLabel_correoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 190, 30));

        jLabel_tipoPadecimiento.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_tipoPadecimiento.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_tipoPadecimiento.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_tipoPadecimiento.setText("Tipo Padecimiento:");
        jPanel1_RegistroUsuarios.add(jLabel_tipoPadecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 140, 30));

        jComboBox_nombrePadecimiento.setBackground(new java.awt.Color(231, 229, 218));
        jComboBox_nombrePadecimiento.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        jComboBox_nombrePadecimiento.setForeground(new java.awt.Color(30, 29, 26));
        jComboBox_nombrePadecimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOLOR", "OBESIDAD", "IRRITACION EN LA PIEL", "INFECCION", "PERDIDA DE VISION", "CANCER" }));
        jComboBox_nombrePadecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_nombrePadecimientoActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(jComboBox_nombrePadecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 230, 30));

        ibiFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibiFoto.setText("FOTO");
        ibiFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1_RegistroUsuarios.add(ibiFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 230, 260));

        txtdescrptionPadecimiento.setBackground(new java.awt.Color(231, 229, 218));
        txtdescrptionPadecimiento.setColumns(20);
        txtdescrptionPadecimiento.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txtdescrptionPadecimiento.setForeground(new java.awt.Color(30, 29, 26));
        txtdescrptionPadecimiento.setRows(5);
        txtdescrptionPadecimiento.setText("Describa su padecimiento");
        txtdescrptionPadecimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdescrptionPadecimientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtdescrptionPadecimiento);

        jPanel1_RegistroUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 240, 90));

        jLabel_nombre.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_nombre.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_nombre.setText("Apeliido:");
        jPanel1_RegistroUsuarios.add(jLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));

        ConboxEleccion.setBackground(new java.awt.Color(231, 229, 218));
        ConboxEleccion.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        ConboxEleccion.setForeground(new java.awt.Color(30, 29, 26));
        ConboxEleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        ConboxEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConboxEleccionActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(ConboxEleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 30));

        btnCargarFoto.setText("Cargar Foto ");
        btnCargarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarFotoActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(btnCargarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 120, 30));

        jLabel_nombre1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_nombre1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_nombre1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_nombre1.setText("Nombre:");
        jPanel1_RegistroUsuarios.add(jLabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 30));

        txtNombre.setBackground(new java.awt.Color(231, 229, 218));
        txtNombre.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(30, 29, 26));
        txtNombre.setToolTipText("");
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNombre.setDropMode(javax.swing.DropMode.INSERT);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 230, 30));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel_cedula1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_cedula1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_cedula1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_cedula1.setText("Cédula:");
        jPanel1_RegistroUsuarios.add(jLabel_cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));

        txtCedula1.setBackground(new java.awt.Color(231, 229, 218));
        txtCedula1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedula1.setForeground(new java.awt.Color(30, 29, 26));
        txtCedula1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1_RegistroUsuarios.add(txtCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 230, 30));

        jLabel_correoElectronico1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_correoElectronico1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_correoElectronico1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_correoElectronico1.setText("Correo Electrónico:");
        jPanel1_RegistroUsuarios.add(jLabel_correoElectronico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 140, 30));

        jComboBox_tipoPadecimiento1.setBackground(new java.awt.Color(231, 229, 218));
        jComboBox_tipoPadecimiento1.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        jComboBox_tipoPadecimiento1.setForeground(new java.awt.Color(30, 29, 26));
        jComboBox_tipoPadecimiento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARDIOLOGIA", "RESPIRATORIO", "DERMATOLOGIA", "NUTRICION", "CIRUGIA", "OFTALMOLOGIA", " " }));
        jComboBox_tipoPadecimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_tipoPadecimiento1ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(jComboBox_tipoPadecimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 230, 30));

        jPanel_Central.add(jPanel1_RegistroUsuarios, "card2");

        jPanel1_Base.add(jPanel_Central, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 700, 580));

        getContentPane().add(jPanel1_Base, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 904, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoActionPerformed

    }//GEN-LAST:event_btnMedicoActionPerformed

    private void btnClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClinicaActionPerformed
        jPanel3_filtroClinica.setVisible(true);
    }//GEN-LAST:event_btnClinicaActionPerformed

    private void btnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaActionPerformed
        Calendario calendario = new Calendario();
        calendario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCitaActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed


    }//GEN-LAST:event_btnRegistroActionPerformed

    private void mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseclicked

        Panel Slide;
        if (evt.getSource() == btnRegistro) {
            jPanel1_RegistroUsuarios.setVisible(true);
            jPanel2_filtroMedico.setVisible(false);
            jPanel2_medico1.setVisible(false);
            jPanel3_filtroClinica.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
        }

        if (evt.getSource() == btnMedico) {
            jPanel1_RegistroUsuarios.setVisible(false);
            jPanel2_filtroMedico.setVisible(true);
            jPanel2_medico1.setVisible(false);
            jPanel3_filtroClinica.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
        }

        if (evt.getSource() == btnClinica) {
            jPanel1_RegistroUsuarios.setVisible(false);
            jPanel2_filtroMedico.setVisible(false);
            jPanel2_medico1.setVisible(false);
            jPanel3_filtroClinica.setVisible(true);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
        }

        if (evt.getSource() == btnCita) {
            jPanel1_RegistroUsuarios.setVisible(false);
            jPanel2_filtroMedico.setVisible(false);
            jPanel2_medico1.setVisible(false);
            jPanel3_filtroClinica.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(true);
        }
    }//GEN-LAST:event_mouseclicked

    private void txtidiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomasActionPerformed

    private void txtCedulaMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico1ActionPerformed

    private void txtFinalizacionEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudiosActionPerformed

    private void txtTituloUniversitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitarioActionPerformed

    private void txtUniversidadEstudio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio1ActionPerformed

    private void txtCorreoMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico1ActionPerformed

    private void txtPaisUniversidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad1ActionPerformed

    private void jButton_VisualizarMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico1ActionPerformed
        // TODO add your handling code here:
        jPanel2_filtroMedico.setVisible(false);
        jPanel2_medico1.setVisible(true);
        jPanel2_medico2.setVisible(false);
        jPanel2_medico3.setVisible(false);
        jPanel2_medico4.setVisible(false);

    }//GEN-LAST:event_jButton_VisualizarMedico1ActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void txtnombreMedico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreMedico4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreMedico4ActionPerformed

    private void txtnombreMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreMedico1ActionPerformed

    private void txtApellido4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido4ActionPerformed

    private void txtEspecialidad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidad4ActionPerformed

    private void jButton_VisualizarMedico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico2ActionPerformed

        jPanel2_medico2.setVisible(true);
        jPanel2_medico1.setVisible(false);
        jPanel2_medico4.setVisible(false);
        jPanel2_medico3.setVisible(false);
        jPanel2_filtroMedico.setVisible(false);

    }//GEN-LAST:event_jButton_VisualizarMedico2ActionPerformed

    private void jButton_VisualizarMedico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico3ActionPerformed
        // TODO add your handling code here:

        jPanel2_medico4.setVisible(false);
        jPanel2_medico1.setVisible(false);
        jPanel2_medico2.setVisible(false);
        jPanel2_medico3.setVisible(true);
        jPanel2_filtroMedico.setVisible(false);

    }//GEN-LAST:event_jButton_VisualizarMedico3ActionPerformed

    private void jButton_VisualizarMedico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico4ActionPerformed
        // TODO add your handling code here:

        jPanel2_medico4.setVisible(true);
        jPanel2_medico1.setVisible(false);
        jPanel2_medico2.setVisible(false);
        jPanel2_medico3.setVisible(false);
        jPanel2_filtroMedico.setVisible(false);
    }//GEN-LAST:event_jButton_VisualizarMedico4ActionPerformed

    private void txtCedulaMedico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico2ActionPerformed

    private void txtCorreoMedico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico2ActionPerformed

    private void txtidiomas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomas1ActionPerformed

    private void txtTituloUniversitario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitario1ActionPerformed

    private void txtFinalizacionEstudios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudios1ActionPerformed

    private void txtUniversidadEstudio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio2ActionPerformed

    private void txtPaisUniversidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad2ActionPerformed

    private void txtCedulaMedico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico3ActionPerformed

    private void txtCorreoMedico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico3ActionPerformed

    private void txtidiomas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomas2ActionPerformed

    private void txtTituloUniversitario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitario2ActionPerformed

    private void txtFinalizacionEstudios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudios2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudios2ActionPerformed

    private void txtUniversidadEstudio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio3ActionPerformed

    private void txtPaisUniversidad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad3ActionPerformed

    private void txtCedulaMedico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico4ActionPerformed

    private void txtCorreoMedico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico4ActionPerformed

    private void txtidiomas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomas3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomas3ActionPerformed

    private void txtTituloUniversitario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitario3ActionPerformed

    private void txtFinalizacionEstudios3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudios3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudios3ActionPerformed

    private void txtUniversidadEstudio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio4ActionPerformed

    private void txtPaisUniversidad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad4ActionPerformed

    private void txtNumeroClinica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica1ActionPerformed

    private void jButton_VisualizarClinica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica1ActionPerformed
        // TODO add your handling code here:

        jPanel3_clinica1.setVisible(true);
        jPanel3_filtroClinica.setVisible(false);
        jPanel3_clinica2.setVisible(false);
        jPanel3_clinica3.setVisible(false);
        jPanel3_clinica4.setVisible(false);

    }//GEN-LAST:event_jButton_VisualizarClinica1ActionPerformed

    private void txtnombreClinica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica1ActionPerformed

    private void txtnombreClinica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica2ActionPerformed

    private void txtNumeroClinica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica2ActionPerformed

    private void txtnombreClinica3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica3ActionPerformed

    private void txtNumeroClinica3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica3ActionPerformed

    private void txtnombreClinica4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica4ActionPerformed

    private void txtNumeroClinica4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica4ActionPerformed

    private void jButton_VisualizarClinica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica2ActionPerformed
        // TODO add your handling code here:

        jPanel3_clinica1.setVisible(false);
        jPanel3_filtroClinica.setVisible(false);
        jPanel3_clinica2.setVisible(true);
        jPanel3_clinica3.setVisible(false);
        jPanel3_clinica4.setVisible(false);

    }//GEN-LAST:event_jButton_VisualizarClinica2ActionPerformed

    private void jButton_VisualizarClinica3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica3ActionPerformed
        // TODO add your handling code here:

        jPanel3_clinica1.setVisible(false);
        jPanel3_filtroClinica.setVisible(false);
        jPanel3_clinica2.setVisible(false);
        jPanel3_clinica3.setVisible(true);
        jPanel3_clinica4.setVisible(false);
    }//GEN-LAST:event_jButton_VisualizarClinica3ActionPerformed

    private void jButton_VisualizarClinica4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica4ActionPerformed
        // TODO add your handling code here:

        jPanel3_clinica1.setVisible(false);
        jPanel3_filtroClinica.setVisible(false);
        jPanel3_clinica2.setVisible(false);
        jPanel3_clinica3.setVisible(false);
        jPanel3_clinica4.setVisible(true);
    }//GEN-LAST:event_jButton_VisualizarClinica4ActionPerformed

    // BOTON CARGAR FOTO 
    File fichero;
    private void btnCargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarFotoActionPerformed
        int resultado;
        CargarFoto ventana = new CargarFoto();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        ventana.jhCargarFoto.setFileFilter(filtro);
        resultado = ventana.jhCargarFoto.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado) {
            fichero = ventana.jhCargarFoto.getSelectedFile();
            try {
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(ibiFoto.getWidth(), ibiFoto.getHeight(), Image.SCALE_DEFAULT));
                ibiFoto.setText(null);
                ibiFoto.setIcon(icono);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen " + ex);

            }
        }

    }//GEN-LAST:event_btnCargarFotoActionPerformed

    private void txtCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Calendario setiar = new Calendario();
        String a = txtNombre.getText();
        String b = txtApeliido.getText();
        String c = txtCedula1.getText();
        String e = txtCorreoElectronico.getText();
        String f = txtdescrptionPadecimiento.getText();

        Persona set = new Persona();
        set.setName(" " + a);

        txtdescrptionPadecimiento.setText(" ");
        txtNombre.setText(" ");
        txtApeliido.setText(" ");
        txtCedula1.setText(" ");
        txtedad.setText(" ");
        txtCorreoElectronico.setText(" ");
        JOptionPane.showMessageDialog(this, "SUS DATOS HAN SIDO GUARDADOS CON  EXITO");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.getText();        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jComboBox_nombrePadecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_nombrePadecimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_nombrePadecimientoActionPerformed

    private void jComboBox_tipoPadecimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tipoPadecimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_tipoPadecimiento1ActionPerformed

    private void ConboxEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConboxEleccionActionPerformed
        String eleccion = (String) ConboxEleccion.getSelectedItem();
    }//GEN-LAST:event_ConboxEleccionActionPerformed

    private void btnPaciente1mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaciente1mouseclicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaciente1mouseclicked

    private void btnPaciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaciente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaciente1ActionPerformed

    private void btnMedico1mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedico1mouseclicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMedico1mouseclicked

    private void btnMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMedico1ActionPerformed

    private void btnRegistro1mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistro1mouseclicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistro1mouseclicked

    private void btnRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistro1ActionPerformed

    private void btnCita1mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCita1mouseclicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCita1mouseclicked

    private void btnCita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCita1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCita1ActionPerformed

    private void btnProcedimiento1mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcedimiento1mouseclicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcedimiento1mouseclicked

    private void btnProcedimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcedimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcedimiento1ActionPerformed

    private void btnClinica1mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClinica1mouseclicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClinica1mouseclicked

    private void btnClinica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClinica1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClinica1ActionPerformed

    private void txtnombreMedico5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreMedico5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreMedico5ActionPerformed

    private void txtApellido5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido5ActionPerformed

    private void jButton_VisualizarMedico5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_VisualizarMedico5ActionPerformed

    private void txtnombreMedico6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreMedico6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreMedico6ActionPerformed

    private void txtApellido8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido8ActionPerformed

    private void txtEspecialidad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidad8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidad8ActionPerformed

    private void jButton_VisualizarMedico6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_VisualizarMedico6ActionPerformed

    private void jButton_VisualizarMedico7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_VisualizarMedico7ActionPerformed

    private void jButton_VisualizarMedico8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_VisualizarMedico8ActionPerformed

    private void txtidiomas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomas4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomas4ActionPerformed

    private void txtCedulaMedico5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico5ActionPerformed

    private void txtFinalizacionEstudios4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudios4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudios4ActionPerformed

    private void txtTituloUniversitario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitario4ActionPerformed

    private void txtUniversidadEstudio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio5ActionPerformed

    private void txtCorreoMedico5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico5ActionPerformed

    private void txtPaisUniversidad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad5ActionPerformed

    private void txtCedulaMedico6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico6ActionPerformed

    private void txtCorreoMedico6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico6ActionPerformed

    private void txtidiomas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomas5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomas5ActionPerformed

    private void txtTituloUniversitario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitario5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitario5ActionPerformed

    private void txtFinalizacionEstudios5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudios5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudios5ActionPerformed

    private void txtUniversidadEstudio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio6ActionPerformed

    private void txtPaisUniversidad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad6ActionPerformed

    private void txtCedulaMedico7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico7ActionPerformed

    private void txtCorreoMedico7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico7ActionPerformed

    private void txtidiomas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomas6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomas6ActionPerformed

    private void txtTituloUniversitario6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitario6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitario6ActionPerformed

    private void txtFinalizacionEstudios6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudios6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudios6ActionPerformed

    private void txtUniversidadEstudio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio7ActionPerformed

    private void txtPaisUniversidad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad7ActionPerformed

    private void txtCedulaMedico8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico8ActionPerformed

    private void txtCorreoMedico8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico8ActionPerformed

    private void txtidiomas7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomas7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomas7ActionPerformed

    private void txtTituloUniversitario7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitario7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitario7ActionPerformed

    private void txtFinalizacionEstudios7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudios7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudios7ActionPerformed

    private void txtUniversidadEstudio8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio8ActionPerformed

    private void txtPaisUniversidad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad8ActionPerformed

    private void txtNumeroClinica5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica5ActionPerformed

    private void jButton_VisualizarClinica5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_VisualizarClinica5ActionPerformed

    private void txtnombreClinica5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica5ActionPerformed

    private void txtnombreClinica6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica6ActionPerformed

    private void txtNumeroClinica6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica6ActionPerformed

    private void txtnombreClinica7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica7ActionPerformed

    private void txtNumeroClinica7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica7ActionPerformed

    private void txtnombreClinica8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica8ActionPerformed

    private void txtNumeroClinica8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica8ActionPerformed

    private void jButton_VisualizarClinica6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_VisualizarClinica6ActionPerformed

    private void jButton_VisualizarClinica7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_VisualizarClinica7ActionPerformed

    private void jButton_VisualizarClinica8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_VisualizarClinica8ActionPerformed

    private void txtCorreoElectronico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronico1ActionPerformed

    private void txtedad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedad1ActionPerformed

    private void jComboBox_nombrePadecimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_nombrePadecimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_nombrePadecimiento1ActionPerformed

    private void ConboxEleccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConboxEleccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConboxEleccion1ActionPerformed

    private void btnCargarFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarFoto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarFoto1ActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox_tipoPadecimiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tipoPadecimiento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_tipoPadecimiento2ActionPerformed

    private void txtdescrptionPadecimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdescrptionPadecimientoMouseClicked
        txtdescrptionPadecimiento.setText(" ");
    }//GEN-LAST:event_txtdescrptionPadecimientoMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jPanel2_filtroMedico.setVisible(true);
        jPanel2_Menu.setVisible(true);
        jPanel2_medico2.setVisible(false);


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jPanel2_filtroMedico.setVisible(true);
        jPanel2_Menu.setVisible(true);
        jPanel2_medico3.setVisible(false);


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jPanel2_filtroMedico.setVisible(true);
        jPanel2_Menu.setVisible(true);
        jPanel2_medico4.setVisible(false);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel2_filtroMedico.setVisible(true);
        jPanel2_Menu.setVisible(true);
        jPanel2_medico1.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel2_Menu.setVisible(true);
        jPanel3_filtroClinica.setVisible(true);
        jPanel3_clinica1.setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jPanel2_Menu.setVisible(true);
        jPanel3_filtroClinica.setVisible(true);
        jPanel3_clinica2.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jPanel2_Menu.setVisible(true);
        jPanel3_filtroClinica.setVisible(true);
        jPanel3_clinica3.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jPanel2_Menu.setVisible(true);
        jPanel3_filtroClinica.setVisible(true);
        jPanel3_clinica4.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Funcionalidades estrella = new Funcionalidades();
        estrella.calificacion();

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Funcionalidades estrella1 = new Funcionalidades();
        estrella1.calificacion();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Funcionalidades estrella2 = new Funcionalidades();
        estrella2.calificacion();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Funcionalidades estrella3 = new Funcionalidades();
        estrella3.calificacion();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Funcionalidades correo = new Funcionalidades();
        correo.auto_email();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Funcionalidades correo1 = new Funcionalidades();
        correo1.auto_email();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
      Funcionalidades correo2 = new Funcionalidades();
        correo2.auto_email();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Funcionalidades correo3 = new Funcionalidades();
        correo3.auto_email();
    }//GEN-LAST:event_jButton18ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ConboxEleccion;
    private javax.swing.JComboBox<String> ConboxEleccion1;
    private javax.swing.JButton btnCargarFoto;
    private javax.swing.JButton btnCargarFoto1;
    private javax.swing.JButton btnCita;
    private javax.swing.JButton btnCita1;
    private javax.swing.JButton btnClinica;
    private javax.swing.JButton btnClinica1;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnMedico1;
    private javax.swing.JButton btnPaciente1;
    private javax.swing.JButton btnProcedimiento1;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRegistro1;
    private javax.swing.JLabel ibiFoto;
    private javax.swing.JLabel ibiFoto1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_VisualizarClinica1;
    private javax.swing.JButton jButton_VisualizarClinica2;
    private javax.swing.JButton jButton_VisualizarClinica3;
    private javax.swing.JButton jButton_VisualizarClinica4;
    private javax.swing.JButton jButton_VisualizarClinica5;
    private javax.swing.JButton jButton_VisualizarClinica6;
    private javax.swing.JButton jButton_VisualizarClinica7;
    private javax.swing.JButton jButton_VisualizarClinica8;
    private javax.swing.JButton jButton_VisualizarMedico1;
    private javax.swing.JButton jButton_VisualizarMedico2;
    private javax.swing.JButton jButton_VisualizarMedico3;
    private javax.swing.JButton jButton_VisualizarMedico4;
    private javax.swing.JButton jButton_VisualizarMedico5;
    private javax.swing.JButton jButton_VisualizarMedico6;
    private javax.swing.JButton jButton_VisualizarMedico7;
    private javax.swing.JButton jButton_VisualizarMedico8;
    public javax.swing.JComboBox<String> jComboBox_nombrePadecimiento;
    public javax.swing.JComboBox<String> jComboBox_nombrePadecimiento1;
    public javax.swing.JComboBox<String> jComboBox_tipoPadecimiento1;
    public javax.swing.JComboBox<String> jComboBox_tipoPadecimiento2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Afiliacion;
    private javax.swing.JLabel jLabel_Afiliacion1;
    private javax.swing.JLabel jLabel_Afiliacion2;
    private javax.swing.JLabel jLabel_Afiliacion3;
    private javax.swing.JLabel jLabel_Afiliacion4;
    private javax.swing.JLabel jLabel_Afiliacion5;
    private javax.swing.JLabel jLabel_Afiliacion6;
    private javax.swing.JLabel jLabel_Afiliacion7;
    private javax.swing.JLabel jLabel_InfoClinica1;
    private javax.swing.JLabel jLabel_InfoClinica2;
    private javax.swing.JLabel jLabel_InfoClinica3;
    private javax.swing.JLabel jLabel_InfoClinica4;
    private javax.swing.JLabel jLabel_InfoClinica5;
    private javax.swing.JLabel jLabel_InfoClinica6;
    private javax.swing.JLabel jLabel_InfoClinica7;
    private javax.swing.JLabel jLabel_InfoClinica8;
    private javax.swing.JLabel jLabel_InfoMedica;
    private javax.swing.JLabel jLabel_InfoMedica1;
    private javax.swing.JLabel jLabel_InfoMedica2;
    private javax.swing.JLabel jLabel_InfoMedica3;
    private javax.swing.JLabel jLabel_InfoMedica4;
    private javax.swing.JLabel jLabel_InfoMedica5;
    private javax.swing.JLabel jLabel_InfoMedica6;
    private javax.swing.JLabel jLabel_InfoMedica7;
    private javax.swing.JLabel jLabel_InfoMedica8;
    private javax.swing.JLabel jLabel_InfoMedica9;
    private javax.swing.JLabel jLabel_InfoPersonal;
    private javax.swing.JLabel jLabel_InfoPersonal1;
    private javax.swing.JLabel jLabel_Menu;
    private javax.swing.JLabel jLabel_Menu1;
    public javax.swing.JLabel jLabel_NombrePadecimiento;
    public javax.swing.JLabel jLabel_NombrePadecimiento1;
    private javax.swing.JLabel jLabel_RegistroMedicos;
    private javax.swing.JLabel jLabel_RegistroMedicos1;
    private javax.swing.JLabel jLabel_canton1;
    private javax.swing.JLabel jLabel_canton2;
    private javax.swing.JLabel jLabel_canton3;
    private javax.swing.JLabel jLabel_canton4;
    private javax.swing.JLabel jLabel_canton5;
    private javax.swing.JLabel jLabel_canton6;
    private javax.swing.JLabel jLabel_canton7;
    private javax.swing.JLabel jLabel_canton8;
    private javax.swing.JLabel jLabel_cedula;
    private javax.swing.JLabel jLabel_cedula1;
    private javax.swing.JLabel jLabel_cedula2;
    private javax.swing.JLabel jLabel_cedula3;
    private javax.swing.JLabel jLabel_correoElectronico;
    private javax.swing.JLabel jLabel_correoElectronico1;
    private javax.swing.JLabel jLabel_correoElectronico2;
    private javax.swing.JLabel jLabel_correoElectronico3;
    public javax.swing.JLabel jLabel_descripPadecimiento;
    public javax.swing.JLabel jLabel_descripPadecimiento1;
    private javax.swing.JLabel jLabel_direccion1;
    private javax.swing.JLabel jLabel_direccion2;
    private javax.swing.JLabel jLabel_direccion3;
    private javax.swing.JLabel jLabel_direccion4;
    private javax.swing.JLabel jLabel_direccion5;
    private javax.swing.JLabel jLabel_direccion6;
    private javax.swing.JLabel jLabel_direccion7;
    private javax.swing.JLabel jLabel_direccion8;
    private javax.swing.JLabel jLabel_distrito1;
    private javax.swing.JLabel jLabel_distrito2;
    private javax.swing.JLabel jLabel_distrito3;
    private javax.swing.JLabel jLabel_distrito4;
    private javax.swing.JLabel jLabel_distrito5;
    private javax.swing.JLabel jLabel_distrito6;
    private javax.swing.JLabel jLabel_distrito7;
    private javax.swing.JLabel jLabel_distrito8;
    private javax.swing.JLabel jLabel_educacion10;
    private javax.swing.JLabel jLabel_educacion3;
    private javax.swing.JLabel jLabel_educacion4;
    private javax.swing.JLabel jLabel_educacion5;
    private javax.swing.JLabel jLabel_educacion6;
    private javax.swing.JLabel jLabel_educacion7;
    private javax.swing.JLabel jLabel_educacion8;
    private javax.swing.JLabel jLabel_educacion9;
    private javax.swing.JLabel jLabel_filtroApellido;
    private javax.swing.JLabel jLabel_filtroApellido1;
    private javax.swing.JLabel jLabel_filtroEspecialidad;
    private javax.swing.JLabel jLabel_filtroEspecialidad1;
    private javax.swing.JLabel jLabel_filtroNombre;
    private javax.swing.JLabel jLabel_filtroNombre1;
    private javax.swing.JLabel jLabel_filtroNombreClinica;
    private javax.swing.JLabel jLabel_filtroNombreClinica1;
    private javax.swing.JLabel jLabel_filtroNumeroClinica;
    private javax.swing.JLabel jLabel_filtroNumeroClinica1;
    private javax.swing.JLabel jLabel_idioma;
    private javax.swing.JLabel jLabel_idioma1;
    private javax.swing.JLabel jLabel_idioma2;
    private javax.swing.JLabel jLabel_idioma3;
    private javax.swing.JLabel jLabel_idioma4;
    private javax.swing.JLabel jLabel_idioma5;
    private javax.swing.JLabel jLabel_idioma6;
    private javax.swing.JLabel jLabel_idioma7;
    private javax.swing.JLabel jLabel_infoContacto1;
    private javax.swing.JLabel jLabel_infoContacto2;
    private javax.swing.JLabel jLabel_infoContacto3;
    private javax.swing.JLabel jLabel_infoContacto4;
    private javax.swing.JLabel jLabel_infoContacto5;
    private javax.swing.JLabel jLabel_infoContacto6;
    private javax.swing.JLabel jLabel_infoContacto7;
    private javax.swing.JLabel jLabel_infoContacto8;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nombre1;
    private javax.swing.JLabel jLabel_nombre2;
    private javax.swing.JLabel jLabel_nombre3;
    private javax.swing.JLabel jLabel_procedimientosRealizados;
    private javax.swing.JLabel jLabel_procedimientosRealizados1;
    private javax.swing.JLabel jLabel_procedimientosRealizados2;
    private javax.swing.JLabel jLabel_procedimientosRealizados3;
    private javax.swing.JLabel jLabel_procedimientosRealizados4;
    private javax.swing.JLabel jLabel_procedimientosRealizados5;
    private javax.swing.JLabel jLabel_procedimientosRealizados6;
    private javax.swing.JLabel jLabel_procedimientosRealizados7;
    private javax.swing.JLabel jLabel_provincia1;
    private javax.swing.JLabel jLabel_provincia2;
    private javax.swing.JLabel jLabel_provincia3;
    private javax.swing.JLabel jLabel_provincia4;
    private javax.swing.JLabel jLabel_provincia5;
    private javax.swing.JLabel jLabel_provincia6;
    private javax.swing.JLabel jLabel_provincia7;
    private javax.swing.JLabel jLabel_provincia8;
    public javax.swing.JLabel jLabel_tipoPadecimiento;
    public javax.swing.JLabel jLabel_tipoPadecimiento1;
    private javax.swing.JPanel jPanel1_Base;
    private javax.swing.JPanel jPanel1_Base1;
    private javax.swing.JPanel jPanel1_RegistroUsuarios;
    private javax.swing.JPanel jPanel1_RegistroUsuarios1;
    private javax.swing.JPanel jPanel2_Menu;
    private javax.swing.JPanel jPanel2_Menu1;
    private javax.swing.JPanel jPanel2_filtroMedico;
    private javax.swing.JPanel jPanel2_filtroMedico1;
    private javax.swing.JPanel jPanel2_medico1;
    private javax.swing.JPanel jPanel2_medico2;
    private javax.swing.JPanel jPanel2_medico3;
    private javax.swing.JPanel jPanel2_medico4;
    private javax.swing.JPanel jPanel2_medico5;
    private javax.swing.JPanel jPanel2_medico6;
    private javax.swing.JPanel jPanel2_medico7;
    private javax.swing.JPanel jPanel2_medico8;
    private javax.swing.JPanel jPanel3_Superior;
    private javax.swing.JPanel jPanel3_Superior1;
    private javax.swing.JPanel jPanel3_clinica1;
    private javax.swing.JPanel jPanel3_clinica2;
    private javax.swing.JPanel jPanel3_clinica3;
    private javax.swing.JPanel jPanel3_clinica4;
    private javax.swing.JPanel jPanel3_clinica5;
    private javax.swing.JPanel jPanel3_clinica6;
    private javax.swing.JPanel jPanel3_clinica7;
    private javax.swing.JPanel jPanel3_clinica8;
    private javax.swing.JPanel jPanel3_filtroClinica;
    private javax.swing.JPanel jPanel3_filtroClinica1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_Central;
    private javax.swing.JPanel jPanel_Central1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea_procedimientoCosto;
    private javax.swing.JTextArea jTextArea_procedimientoCosto1;
    private javax.swing.JTextArea jTextArea_procedimientoCosto2;
    private javax.swing.JTextArea jTextArea_procedimientoCosto3;
    private javax.swing.JTextArea jTextArea_procedimientoCosto4;
    private javax.swing.JTextArea jTextArea_procedimientoCosto5;
    private javax.swing.JTextArea jTextArea_procedimientoCosto6;
    private javax.swing.JTextArea jTextArea_procedimientoCosto7;
    private javax.swing.JTextField txtAfiliacionPerteneciente;
    private javax.swing.JTextField txtAfiliacionPerteneciente1;
    private javax.swing.JTextField txtAfiliacionPerteneciente2;
    private javax.swing.JTextField txtAfiliacionPerteneciente3;
    private javax.swing.JTextField txtAfiliacionPerteneciente4;
    private javax.swing.JTextField txtAfiliacionPerteneciente5;
    private javax.swing.JTextField txtAfiliacionPerteneciente6;
    private javax.swing.JTextField txtAfiliacionPerteneciente7;
    private javax.swing.JTextField txtApeliido;
    private javax.swing.JTextField txtApeliido1;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtApellido3;
    private javax.swing.JTextField txtApellido4;
    private javax.swing.JTextField txtApellido5;
    private javax.swing.JTextField txtApellido6;
    private javax.swing.JTextField txtApellido7;
    private javax.swing.JTextField txtApellido8;
    private javax.swing.JTextField txtCanton1;
    private javax.swing.JTextField txtCanton2;
    private javax.swing.JTextField txtCanton3;
    private javax.swing.JTextField txtCanton4;
    private javax.swing.JTextField txtCanton5;
    private javax.swing.JTextField txtCanton6;
    private javax.swing.JTextField txtCanton7;
    private javax.swing.JTextField txtCanton8;
    private javax.swing.JTextField txtCedula1;
    private javax.swing.JTextField txtCedula2;
    private javax.swing.JTextField txtCedulaMedico1;
    private javax.swing.JTextField txtCedulaMedico2;
    private javax.swing.JTextField txtCedulaMedico3;
    private javax.swing.JTextField txtCedulaMedico4;
    private javax.swing.JTextField txtCedulaMedico5;
    private javax.swing.JTextField txtCedulaMedico6;
    private javax.swing.JTextField txtCedulaMedico7;
    private javax.swing.JTextField txtCedulaMedico8;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtCorreoElectronico1;
    private javax.swing.JTextField txtCorreoMedico1;
    private javax.swing.JTextField txtCorreoMedico2;
    private javax.swing.JTextField txtCorreoMedico3;
    private javax.swing.JTextField txtCorreoMedico4;
    private javax.swing.JTextField txtCorreoMedico5;
    private javax.swing.JTextField txtCorreoMedico6;
    private javax.swing.JTextField txtCorreoMedico7;
    private javax.swing.JTextField txtCorreoMedico8;
    private javax.swing.JTextField txtDireccionGeneral1;
    private javax.swing.JTextField txtDireccionGeneral2;
    private javax.swing.JTextField txtDireccionGeneral3;
    private javax.swing.JTextField txtDireccionGeneral4;
    private javax.swing.JTextField txtDireccionGeneral5;
    private javax.swing.JTextField txtDireccionGeneral6;
    private javax.swing.JTextField txtDireccionGeneral7;
    private javax.swing.JTextField txtDireccionGeneral8;
    private javax.swing.JTextField txtDistrito1;
    private javax.swing.JTextField txtDistrito2;
    private javax.swing.JTextField txtDistrito3;
    private javax.swing.JTextField txtDistrito4;
    private javax.swing.JTextField txtDistrito5;
    private javax.swing.JTextField txtDistrito6;
    private javax.swing.JTextField txtDistrito7;
    private javax.swing.JTextField txtDistrito8;
    private javax.swing.JTextField txtEspecialidad1;
    private javax.swing.JTextField txtEspecialidad2;
    private javax.swing.JTextField txtEspecialidad3;
    private javax.swing.JTextField txtEspecialidad4;
    private javax.swing.JTextField txtEspecialidad5;
    private javax.swing.JTextField txtEspecialidad6;
    private javax.swing.JTextField txtEspecialidad7;
    private javax.swing.JTextField txtEspecialidad8;
    private javax.swing.JTextField txtEspecialidadMedico1;
    private javax.swing.JTextField txtEspecialidadMedico2;
    private javax.swing.JTextField txtEspecialidadMedico3;
    private javax.swing.JTextField txtEspecialidadMedico4;
    private javax.swing.JTextField txtEspecialidadMedico5;
    private javax.swing.JTextField txtEspecialidadMedico6;
    private javax.swing.JTextField txtEspecialidadMedico7;
    private javax.swing.JTextField txtEspecialidadMedico8;
    private javax.swing.JTextField txtFinalizacionEstudios;
    private javax.swing.JTextField txtFinalizacionEstudios1;
    private javax.swing.JTextField txtFinalizacionEstudios2;
    private javax.swing.JTextField txtFinalizacionEstudios3;
    private javax.swing.JTextField txtFinalizacionEstudios4;
    private javax.swing.JTextField txtFinalizacionEstudios5;
    private javax.swing.JTextField txtFinalizacionEstudios6;
    private javax.swing.JTextField txtFinalizacionEstudios7;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombreClinica1;
    private javax.swing.JTextField txtNombreClinica2;
    private javax.swing.JTextField txtNombreClinica3;
    private javax.swing.JTextField txtNombreClinica4;
    private javax.swing.JTextField txtNombreClinica5;
    private javax.swing.JTextField txtNombreClinica6;
    private javax.swing.JTextField txtNombreClinica7;
    private javax.swing.JTextField txtNombreClinica8;
    private javax.swing.JTextField txtNombreMedico1;
    private javax.swing.JTextField txtNombreMedico2;
    private javax.swing.JTextField txtNombreMedico3;
    private javax.swing.JTextField txtNombreMedico4;
    private javax.swing.JTextField txtNombreMedico5;
    private javax.swing.JTextField txtNombreMedico6;
    private javax.swing.JTextField txtNombreMedico7;
    private javax.swing.JTextField txtNombreMedico8;
    private javax.swing.JTextField txtNumeroClinica1;
    private javax.swing.JTextField txtNumeroClinica2;
    private javax.swing.JTextField txtNumeroClinica3;
    private javax.swing.JTextField txtNumeroClinica4;
    private javax.swing.JTextField txtNumeroClinica5;
    private javax.swing.JTextField txtNumeroClinica6;
    private javax.swing.JTextField txtNumeroClinica7;
    private javax.swing.JTextField txtNumeroClinica8;
    private javax.swing.JTextField txtPaisUniversidad1;
    private javax.swing.JTextField txtPaisUniversidad2;
    private javax.swing.JTextField txtPaisUniversidad3;
    private javax.swing.JTextField txtPaisUniversidad4;
    private javax.swing.JTextField txtPaisUniversidad5;
    private javax.swing.JTextField txtPaisUniversidad6;
    private javax.swing.JTextField txtPaisUniversidad7;
    private javax.swing.JTextField txtPaisUniversidad8;
    private javax.swing.JTextField txtProvincia1;
    private javax.swing.JTextField txtProvincia2;
    private javax.swing.JTextField txtProvincia3;
    private javax.swing.JTextField txtProvincia4;
    private javax.swing.JTextField txtProvincia5;
    private javax.swing.JTextField txtProvincia6;
    private javax.swing.JTextField txtProvincia7;
    private javax.swing.JTextField txtProvincia8;
    private javax.swing.JTextField txtSlogan;
    private javax.swing.JTextField txtSlogan1;
    private javax.swing.JTextField txtSlogan2;
    private javax.swing.JTextField txtSlogan3;
    private javax.swing.JTextField txtSlogan4;
    private javax.swing.JTextField txtSlogan5;
    private javax.swing.JTextField txtSlogan6;
    private javax.swing.JTextField txtSlogan7;
    private javax.swing.JTextField txtTituloUniversitario;
    private javax.swing.JTextField txtTituloUniversitario1;
    private javax.swing.JTextField txtTituloUniversitario2;
    private javax.swing.JTextField txtTituloUniversitario3;
    private javax.swing.JTextField txtTituloUniversitario4;
    private javax.swing.JTextField txtTituloUniversitario5;
    private javax.swing.JTextField txtTituloUniversitario6;
    private javax.swing.JTextField txtTituloUniversitario7;
    private javax.swing.JTextField txtUniversidadEstudio1;
    private javax.swing.JTextField txtUniversidadEstudio2;
    private javax.swing.JTextField txtUniversidadEstudio3;
    private javax.swing.JTextField txtUniversidadEstudio4;
    private javax.swing.JTextField txtUniversidadEstudio5;
    private javax.swing.JTextField txtUniversidadEstudio6;
    private javax.swing.JTextField txtUniversidadEstudio7;
    private javax.swing.JTextField txtUniversidadEstudio8;
    public javax.swing.JTextArea txtdescrptionPadecimiento;
    public javax.swing.JTextArea txtdescrptionPadecimiento1;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtedad1;
    private javax.swing.JTextField txtidiomas;
    private javax.swing.JTextField txtidiomas1;
    private javax.swing.JTextField txtidiomas2;
    private javax.swing.JTextField txtidiomas3;
    private javax.swing.JTextField txtidiomas4;
    private javax.swing.JTextField txtidiomas5;
    private javax.swing.JTextField txtidiomas6;
    private javax.swing.JTextField txtidiomas7;
    private javax.swing.JTextField txtnombreClinica1;
    private javax.swing.JTextField txtnombreClinica2;
    private javax.swing.JTextField txtnombreClinica3;
    private javax.swing.JTextField txtnombreClinica4;
    private javax.swing.JTextField txtnombreClinica5;
    private javax.swing.JTextField txtnombreClinica6;
    private javax.swing.JTextField txtnombreClinica7;
    private javax.swing.JTextField txtnombreClinica8;
    private javax.swing.JTextField txtnombreMedico1;
    private javax.swing.JTextField txtnombreMedico2;
    private javax.swing.JTextField txtnombreMedico3;
    private javax.swing.JTextField txtnombreMedico4;
    private javax.swing.JTextField txtnombreMedico5;
    private javax.swing.JTextField txtnombreMedico6;
    private javax.swing.JTextField txtnombreMedico7;
    private javax.swing.JTextField txtnombreMedico8;
    private javax.swing.JTextField txtnumeroClinica1;
    private javax.swing.JTextField txtnumeroClinica2;
    private javax.swing.JTextField txtnumeroClinica3;
    private javax.swing.JTextField txtnumeroClinica4;
    private javax.swing.JTextField txtnumeroClinica5;
    private javax.swing.JTextField txtnumeroClinica6;
    private javax.swing.JTextField txtnumeroClinica7;
    private javax.swing.JTextField txtnumeroClinica8;
    // End of variables declaration//GEN-END:variables
}
