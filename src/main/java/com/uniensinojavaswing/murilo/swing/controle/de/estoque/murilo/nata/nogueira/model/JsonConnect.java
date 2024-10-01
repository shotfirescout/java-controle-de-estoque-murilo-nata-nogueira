/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniensinojavaswing.murilo.swing.controle.de.estoque.murilo.nata.nogueira.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class JsonConnect {
    public static Conector criaConector(String nomeArquivo){
        ObjectMapper objectMapper = new ObjectMapper();
        
        Conector conector = null;
        ClassLoader loader = JsonConnect.class.getClassLoader();
        try(InputStream inputStream = loader.getResourceAsStream(nomeArquivo)){
            if(inputStream != null){
                conector = objectMapper.readValue(inputStream, Conector.class);
            } else {
                JOptionPane.showMessageDialog(null, "Arquivo JSON não encontrado", "Arquivo não encontrado", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e){
            
        }
        return conector;
    }
}
