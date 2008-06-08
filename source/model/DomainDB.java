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

import java.lang.reflect.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que realiza as operações no BD
 */
public class DomainDB {

    private Connection conn = null;

    private Class classe = null;

 	/**
 	 * Construtor dessa classe
 	 */
 	public DomainDB(){
        try{
       		/**
       		 * Configura o driver do BD, nesse caso usamos o Paradox
       		 */
       		Class.forName("com.hxtt.sql.paradox.ParadoxDriver");
                conn = DriverManager.getConnection("jdbc:paradox:/base");
            conn.setAutoCommit(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Insere um registro no banco
     * @param obj
     */
    public boolean insert(Object obj, int id) {
        boolean result = false;

        try {
            StringBuffer sql = new StringBuffer("INSERT INTO ");

            String nomeClasse = getNomeClasse(obj);
            sql.append("tb" + nomeClasse).append("(");

            Field[] atributos = classe.getDeclaredFields();
            Field campo = null;

            for (int i = 0; i < atributos.length; i++) {
                campo = atributos[i];
                sql.append(campo.getName());
                if (i != atributos.length - 1)
                    sql.append(",");
            }

            sql.append(") VALUES(");

            Method[] metodos = classe.getMethods();

            for (int i = 0; i < atributos.length; i++) {
                campo = atributos[i];
                for (int j = 0; j < metodos.length; j++) {
                    Method metodo = metodos[j];
                    if(campo.getName().equalsIgnoreCase("OID")){
                        sql.append("'").append(id).append("'");
                        break;
                    }else if (metodo.getName().equalsIgnoreCase(
                            "get" + campo.getName())) {
                        Object retorno = metodo.invoke(obj, new Object[] {});
                        String valor = retorno != null ? retorno.toString()
                                : "";
                        sql.append("'").append(valor).append("'");
                        break;
                    }

                }
                if (i != atributos.length - 1)
                    sql.append(",");

            }

            sql.append(")");
            System.out.println(sql.toString());
            PreparedStatement pstmt = conn.prepareStatement(sql.toString());

            pstmt.executeUpdate();
            pstmt.close();
            result = true;
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage() + "\n"
                    + sqle.getNextException() + "\n" + sqle.getStackTrace());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    /**
     * Deleta um determinado registro no banco
     * @param obj
     */
    public boolean delete(Object obj){

        boolean result = false;

        try{
            StringBuffer sql = new StringBuffer("DELETE FROM ");

            String nomeClasse = getNomeClasse(obj);

            sql.append("tb" + nomeClasse);

            sql.append(" WHERE OID = ");

                if(obj instanceof umCliente){
                    sql.append(((umCliente)obj).getOid());
                }
                if(obj instanceof umFilial){
                    sql.append(((umFilial)obj).getOid());
                }
                if(obj instanceof umCarro){
                    sql.append(((umCarro)obj).getOid());
                }
                if(obj instanceof umModelo){
                    sql.append(((umModelo)obj).getOid());
                }
                if(obj instanceof umBlacklist){
                    sql.append(((umBlacklist)obj).getOid());
                }
                if(obj instanceof umGrupo){
                    sql.append(((umGrupo)obj).getOid());
                }
                if(obj instanceof umReserva){
                    sql.append(((umReserva)obj).getOid());
                }
                if(obj instanceof umLocacoes){
                    sql.append(((umLocacoes)obj).getOid());
                }
                if(obj instanceof umFuncionario){
                    sql.append(((umFuncionario)obj).getOid());
                }

            PreparedStatement pstmt = conn.prepareStatement(sql.toString());

            pstmt.executeUpdate();
            pstmt.close();
            result = true;
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean update(Object obj){
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

            StringBuffer sql = new StringBuffer("UPDATE ");

            String nomeClasse = getNomeClasse(obj);

            nomeClasse = getNomeClasse(obj);
            sql.append("tb" + nomeClasse);

            sql.append(" SET ");

            Method[] metodos = classe.getMethods();
            Field[] atributos = classe.getDeclaredFields();
            Field campo = null;

            for(int i = 0; i < atributos.length; i++){
                campo = atributos[i];
                for(int j = 0; j < metodos.length; j++){
                    Method metodo = metodos[j];
                    if(metodo.getName().equalsIgnoreCase("get" + campo.getName())){
                        Object retorno = metodo.invoke(obj, new Object[]{});
                        String valor = retorno != null ? retorno.toString() : "";
                        sql.append(campo.getName()).append("='").append(valor).append("'");
                    }

                }
                if(i != atributos.length-1)
                    sql.append(",");

            }

            sql.append(" WHERE OID = ");

                if(obj instanceof umCliente){
                    sql.append(((umCliente)obj).getOid());
                }
                if(obj instanceof umFilial){
                    sql.append(((umFilial)obj).getOid());
                }
                if(obj instanceof umCarro){
                    sql.append(((umCarro)obj).getOid());
                }
                if(obj instanceof umModelo){
                    sql.append(((umModelo)obj).getOid());
                }
                if(obj instanceof umBlacklist){
                    sql.append(((umBlacklist)obj).getOid());
                }
                if(obj instanceof umGrupo){
                    sql.append(((umGrupo)obj).getOid());
                }
                if(obj instanceof umReserva){
                    sql.append(((umReserva)obj).getOid());
                }
                if(obj instanceof umLocacoes){
                    sql.append(((umLocacoes)obj).getOid());
                }
                if(obj instanceof umFuncionario){
                    sql.append(((umFuncionario)obj).getOid());
                }


            PreparedStatement pstmt = conn.prepareStatement(sql.toString());
            pstmt.executeUpdate();

            pstmt.close();
            result = true;
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }


    /**
     * Busca e retorna um lista com todos os registro de uma determinada tabela
     * @param obj
     * @return result - lista com os objetos
     */
    public List findAll(Object obj){
        List result = new ArrayList();
        try{
            StringBuffer sql = new StringBuffer("SELECT * FROM ");
            String nomeClasse = getNomeClasse(obj);
            sql.append("tb" + nomeClasse);

            PreparedStatement pstmt = conn.prepareStatement(sql.toString());
            ResultSet rs = pstmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount ();
            List colunas = new ArrayList();

            for(int i = 1; i <= numCols; i++){
                if(!rsmd.getColumnName(i).equalsIgnoreCase("OID"))
                    colunas.add(rsmd.getColumnName(i));
            }

            result.add((String[])colunas.toArray(new String[colunas.size()]));

            while(rs.next()){

                Object temp = null;

                if(obj instanceof umCliente){
                    temp = new umCliente();
                }
                if(obj instanceof umFilial){
                    temp = new umFilial();
                }
                if(obj instanceof umCarro){
                    temp = new umCarro();
                }
                if(obj instanceof umModelo){
                    temp = new umModelo();
                }
                if(obj instanceof umBlacklist){
                    temp = new umBlacklist();
                }
                if(obj instanceof umGrupo){
                    temp = new umGrupo();
                }
                if(obj instanceof umReserva){
                    temp = new umReserva();
                }
                if(obj instanceof umLocacoes){
                    temp = new umLocacoes();
                }
                if(obj instanceof umFuncionario){
                    temp = new umFuncionario();
                }

                Method[] metodos = classe.getMethods();
                Field[] atributos = classe.getDeclaredFields();
                Field campo = null;

                for(int i =0; i < atributos.length; i++){
                    campo = atributos[i];
                    for(int j = 0; j < metodos.length; j++){
                        Method metodo = metodos[j];
                        if(metodo.getName().equalsIgnoreCase("set" + campo.getName())){
                            Object valorParam = this.getMetodo(rs, campo);

		        			if((valorParam instanceof Integer || valorParam instanceof Float ||
		        					valorParam instanceof Long || valorParam instanceof Double) &&
		        					!metodo.getParameterTypes()[0].getName().equals("java.lang.String")){
	                             metodo.invoke(temp, new Object[]{valorParam});
                                 break;
                            }else if(valorParam instanceof java.lang.String &&
                                    metodo.getParameterTypes()[0].getName().equals("java.lang.String") ){
                                 metodo.invoke(temp, new Object[]{valorParam});
                                 break;
                            }

                        }

                    }
                }

                result.add(temp);
        }
        	pstmt.close();
			rs.close();


        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return result;
    }


    /**
     * Retorna o nome da classe referente à instância
     * @param obj
     * @return nomeClasse
     */

    public String getNomeClasse(Object obj){

                if(obj instanceof umCliente){
                    this.classe = ((umCliente)obj).getClass();
                }
                if(obj instanceof umFilial){
                    this.classe = ((umFilial)obj).getClass();
                }
                if(obj instanceof umCarro){
                    this.classe = ((umCarro)obj).getClass();
                }
                if(obj instanceof umModelo){
                    this.classe = ((umModelo)obj).getClass();
                }
                if(obj instanceof umBlacklist){
                    this.classe = ((umBlacklist)obj).getClass();
                }
                if(obj instanceof umGrupo){
                    this.classe = ((umGrupo)obj).getClass();
                }
                if(obj instanceof umReserva){
                    this.classe = ((umReserva)obj).getClass();
                }
                if(obj instanceof umLocacoes){
                    this.classe = ((umLocacoes)obj).getClass();
                }
                if(obj instanceof umFuncionario){
                    this.classe = ((umFuncionario)obj).getClass();
                }

        String nomeClasse = classe.getName();
        nomeClasse = nomeClasse.substring(nomeClasse.lastIndexOf(".")+3, nomeClasse.length());

        return nomeClasse;
    }

    /**
     * Obtém o Oid,id único da cada registro
     * @param obj
     * @return result
     */
     public int getOid(Object obj){
        int result = 0;

        try {

            StringBuffer sql = new StringBuffer("SELECT MAX(OID)+1 AS OID FROM ");
            String nomeClasse = getNomeClasse(obj);

            sql.append("tb" + nomeClasse);

            PreparedStatement pstmt = conn.prepareStatement(sql.toString());
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                result = rs.getInt("OID");
            }
			pstmt.close();
			rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }


	public Object getMetodo(ResultSet rs, Field campo) throws SQLException {
		Object result = null;

		Class classTmp = campo.getType();

		if (classTmp.getName().equalsIgnoreCase("int")) {
			result = Integer.valueOf(rs.getString(campo.getName()));
		} else {
			if (classTmp.getName().equalsIgnoreCase("java.lang.String")) {
				result = rs.getString(campo.getName());
			} else {
				if (classTmp.getName().equalsIgnoreCase("float")) {
					result = Float.valueOf(rs.getString(campo.getName()));
				} else {
					if (classTmp.getName().equalsIgnoreCase("double")) {
						result = Double.valueOf(rs.getString(campo.getName()));
					} else {
						if (classTmp.getName().equalsIgnoreCase("long")) {
							result = Long
									.valueOf(rs.getString(campo.getName()));
						} else {
							if (classTmp.getName().equalsIgnoreCase("boolean")) {
								result = Boolean.valueOf(rs.getString(campo
										.getName()));
							} else {
								if (classTmp.getName().equalsIgnoreCase("char")) {
									result = String.valueOf(rs.getString(campo
											.getName()));
								}
							}
						}
					}
				}
			}
		}
		return result;
	}
}
