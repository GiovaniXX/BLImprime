package controller;

import DAO.DAOCliente;
import java.util.ArrayList;
import model.ModelCliente;

public class ControllerCliente {

    public static void gerarRelatorioCliente() {
//        (List<Cliente> clients, Map<String, Integer> salesData)  {
//            System.out.println("Generating report for clients...");
//
//            for (Cliente client : clients) {
//                int totalSales = 0;
//                if (salesData.containsKey(client.getName())) {
//                    totalSales = salesData.get(client.getName());
//                }
//
//                System.out.println("Client: " + client.getName());
//                System.out.println("Total sales: " + totalSales);
//            }
//        }
    }

    private DAOCliente daoCliente = new DAOCliente();

    /**
     * Grava Cliente
     *
     * @param pModelCliente
     * @return int
     */
    public int salvarClienteController(ModelCliente pModelCliente) {
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
     * Recupera Cliente
     *
     * @param pIdCliente
     * @return ModelCliente
     */
    public ModelCliente getClienteController(int pIdCliente) {
        return this.daoCliente.getClienteDAO(pIdCliente);
    }

    /**
     * Recupera Cliente
     *
     * @param pNomeCliente
     * @return ModelCliente
     */
    public ModelCliente getClienteController(String pNomeCliente) {
        return this.daoCliente.getClienteDAO(pNomeCliente);
    }

    /**
     * Recupera uma lista de clientes
     *
     * @return
     */
    public ArrayList<ModelCliente> getListaClientesController() {
        return this.daoCliente.getListaClienteDAO();
    }

    /**
     * Atualiza Cliente
     *
     * @param pModelCliente
     * @return boolean
     */
    public boolean atualizarClienteController(ModelCliente pModelCliente) {
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
     * Exclui Cliente
     *
     * @param pIdCliente
     * @return boolean
     */
    public boolean excluirClienteController(int pIdCliente) {
        return this.daoCliente.excluirClienteDAO(pIdCliente);
    }
}
