/*
 * CÓDIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da geração 06/05/2008
 * Hora da geração 09:54 AM
 * 
 * Nome Nome do Programa
 * E-mail Seu Email
 * Autor Nome do Autor
 * Versão Versão do Programa
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.*;

import model.Maintenance;
import model.DomainDB;
import model.umCliente;
import model.umFilial;
import model.umCarro;
import model.umModelo;
import model.umBlacklist;
import model.umGrupo;
import model.umReserva;
import model.umLocacoes;
import model.umFuncionario;

/**
 * Controla as interações entre o formulario da manutenção
 * e a classe DomainDB
 */
public class Ctrlmaintenance {

    private DomainDB dominio = new DomainDB();


    public boolean incluir(Object obj) {
        boolean result = false;
        try{

                if(obj instanceof umCliente){
                    ((umCliente)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umCliente)obj, dominio.getOid(obj));
                }
                if(obj instanceof umFilial){
                    ((umFilial)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umFilial)obj, dominio.getOid(obj));
                }
                if(obj instanceof umCarro){
                    ((umCarro)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umCarro)obj, dominio.getOid(obj));
                }
                if(obj instanceof umModelo){
                    ((umModelo)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umModelo)obj, dominio.getOid(obj));
                }
                if(obj instanceof umBlacklist){
                    ((umBlacklist)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umBlacklist)obj, dominio.getOid(obj));
                }
                if(obj instanceof umGrupo){
                    ((umGrupo)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umGrupo)obj, dominio.getOid(obj));
                }
                if(obj instanceof umReserva){
                    ((umReserva)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umReserva)obj, dominio.getOid(obj));
                }
                if(obj instanceof umLocacoes){
                    ((umLocacoes)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umLocacoes)obj, dominio.getOid(obj));
                }
                if(obj instanceof umFuncionario){
                    ((umFuncionario)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umFuncionario)obj, dominio.getOid(obj));
                }

            result = true;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean excluir(Object obj) {
        boolean result = false;
        try{

                if(obj instanceof umCliente){
                    dominio.delete((umCliente)obj);
                }
                if(obj instanceof umFilial){
                    dominio.delete((umFilial)obj);
                }
                if(obj instanceof umCarro){
                    dominio.delete((umCarro)obj);
                }
                if(obj instanceof umModelo){
                    dominio.delete((umModelo)obj);
                }
                if(obj instanceof umBlacklist){
                    dominio.delete((umBlacklist)obj);
                }
                if(obj instanceof umGrupo){
                    dominio.delete((umGrupo)obj);
                }
                if(obj instanceof umReserva){
                    dominio.delete((umReserva)obj);
                }
                if(obj instanceof umLocacoes){
                    dominio.delete((umLocacoes)obj);
                }
                if(obj instanceof umFuncionario){
                    dominio.delete((umFuncionario)obj);
                }

            result = true;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }


    /**
     * Atualiza os registros que estão sendo mostrados atualmente
     * @param column valor obj
     * @return result
     */
    public boolean atualizar(String column, String valor, Object obj) {

        boolean result = false;
        Class classe = null;
        try{

                if(obj instanceof umCliente){
                    classe = ((umCliente)obj).getClass();
                }
                if(obj instanceof umFilial){
                    classe = ((umFilial)obj).getClass();
                }
                if(obj instanceof umCarro){
                    classe = ((umCarro)obj).getClass();
                }
                if(obj instanceof umModelo){
                    classe = ((umModelo)obj).getClass();
                }
                if(obj instanceof umBlacklist){
                    classe = ((umBlacklist)obj).getClass();
                }
                if(obj instanceof umGrupo){
                    classe = ((umGrupo)obj).getClass();
                }
                if(obj instanceof umReserva){
                    classe = ((umReserva)obj).getClass();
                }
                if(obj instanceof umLocacoes){
                    classe = ((umLocacoes)obj).getClass();
                }
                if(obj instanceof umFuncionario){
                    classe = ((umFuncionario)obj).getClass();
                }

            Method[] metodos = classe.getMethods();
            for(int i =0; i < metodos.length; i++){
                Method metodo = metodos[i];

                if(metodo.getName().equalsIgnoreCase("set" + column)){
                    Class[] params = metodo.getParameterTypes();
                    for(int j = 0; j < params.length; j++){
                        if(params[j].getName().equals("java.lang.String")){
                            metodo.invoke(obj, new Object[]{valor});

                        }
                    }

                }
            }

                if(obj instanceof umCliente){
                    dominio.update((umCliente)obj);
                }
                if(obj instanceof umFilial){
                    dominio.update((umFilial)obj);
                }
                if(obj instanceof umCarro){
                    dominio.update((umCarro)obj);
                }
                if(obj instanceof umModelo){
                    dominio.update((umModelo)obj);
                }
                if(obj instanceof umBlacklist){
                    dominio.update((umBlacklist)obj);
                }
                if(obj instanceof umGrupo){
                    dominio.update((umGrupo)obj);
                }
                if(obj instanceof umReserva){
                    dominio.update((umReserva)obj);
                }
                if(obj instanceof umLocacoes){
                    dominio.update((umLocacoes)obj);
                }
                if(obj instanceof umFuncionario){
                    dominio.update((umFuncionario)obj);
                }

            result = true;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;

    }

    public List buscar(Object obj) {
        List result = new ArrayList();
        try{
	        result = dominio.findAll(obj);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;

    }

	public void beginCase(Object obj) {
		Maintenance maintenance = new Maintenance();
        maintenance.setInstancia(obj);
        maintenance.setVisible(true);
	}

}

