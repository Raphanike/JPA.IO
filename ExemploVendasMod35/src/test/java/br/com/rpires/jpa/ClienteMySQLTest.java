package br.com.rpires.jpa;

import org.junit.Assert;
import org.junit.Test;

import br.com.rpires.dao.jpa.ClienteJpaDB3DAO;
import br.com.rpires.dao.jpa.IClienteJpaDAO;
import br.com.rpires.domain.jpa.ClienteJpa2;
import br.com.rpires.exceptions.DAOException;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

import java.util.Random;

public class ClienteMySQLTest {

    private IClienteJpaDAO<ClienteJpa2> clienteDB3Dao;
    private Random rd;

    public ClienteMySQLTest() {
        this.clienteDB3Dao = new ClienteJpaDB3DAO(); // Usa o DAO do MySQL
        this.rd = new Random();
    }

    @Test
    public void cadastrarClienteNoMySQL() throws TipoChaveNaoEncontradaException, DAOException {
        ClienteJpa2 cliente = criarCliente();
        ClienteJpa2 retorno = clienteDB3Dao.cadastrar(cliente);
        Assert.assertNotNull("Cliente não foi salvo!", retorno);
        System.out.println("Cliente salvo com sucesso no MySQL com ID: " + retorno.getId());
    }

    private ClienteJpa2 criarCliente() {
        ClienteJpa2 cliente = new ClienteJpa2();
        cliente.setCpf(rd.nextLong());
        cliente.setNome("Rodrigo MySQL");
        cliente.setCidade("São Paulo");
        cliente.setEnd("Rua Teste");
        cliente.setEstado("SP");
        cliente.setNumero(123);
        cliente.setTel(1199999999L);
        return cliente;
    }
}
