package br.edu.ifpb.padroes.storewebv3.service;

//Padrão de Mediator


public interface Mediator {
	
    void notify(MediatedService service, EMediatorEvents event);


}
