package br.edu.ifpb.padroes.storewebv3.service;

//Padrão de Mediator


public abstract class MediatedService {
	
	protected final Mediator mediator;

    public MediatedService(Mediator mediator) {
        this.mediator = mediator;
    }

}
