/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniensinojavaswing.murilo.swing.controle.de.estoque.murilo.nata.nogueira.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author muril
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Conector {
    @JsonProperty("Server")
    private String Server;
    
    @JsonProperty("Database")
    private String Database;
    
    @JsonProperty("Uid")
    private String Uid;
    
    @JsonProperty("Password")
    private String Password;

    
    public String getServer() {
        return Server;
    }

    public void setServer(String Server) {
        this.Server = Server;
    }
    
    
    public String getDatabase() {
        return Database;
    }

    public void setDatabase(String Database) {
        this.Database = Database;
    }

    @JsonProperty("Uid")
    public String getUid() {
        return Uid;
    }

    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    @JsonProperty("Password")
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Conector{" + "Server=" + Server + ", Database=" + Database + ", Uid=" + Uid + ", Password=" + Password + '}';
    }
    
    
}
