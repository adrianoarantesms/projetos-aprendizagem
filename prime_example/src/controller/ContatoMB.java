package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import dao.ContatoDAO;
import model.Contato;

import java.awt.event.ActionListener;
import java.util.List;


@ManagedBean
public class ContatoMB {
	private Contato contato;
	private ContatoDAO contatoDAO;
	private List<Contato> lista;	
	
	public ContatoMB() {
		contatoDAO = new ContatoDAO();
		contato = new Contato();
		
		lista = contatoDAO.listarTodos();				
	}
	
	public Contato getContato(){
		return this.contato;
	}
	
	public void setContato(Contato contato){
		this.contato = contato;
	}
	
	public List<Contato> getList() {
		return this.lista;
	}
	
	public void salvar() {
		contatoDAO.salvar(contato);
		addMessage("Contato Salvo");
		lista = contatoDAO.listarTodos();
	}
	 
	
	
	
	
	public void addMessage(String summary) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	}
    

}    

     

