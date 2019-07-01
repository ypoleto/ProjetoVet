package DAOs;

import static DAOs.DAOGenerico.em;
import Entidades.Responsavel;
import java.util.ArrayList;
import java.util.List;

public class DAOResponsavel extends DAOGenerico<Responsavel> {

    public DAOResponsavel() {
        super(Responsavel.class);
    }

    public int autoIdResponsavel() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.idResponsavel) FROM Responsavel e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }

    public List<Responsavel> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Responsavel e WHERE e.nomeResponsavel LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }

    public List<Responsavel> listById(int id) {
        return em.createQuery("SELECT e FROM Responsavel e WHERE e.idResponsavel = :id").setParameter("id", id).getResultList();
    }

    public List<Responsavel> listInOrderNome() {
        return em.createQuery("SELECT e FROM Responsavel e ORDER BY e.nomeResponsavel").getResultList();
    }

    public List<Responsavel> listInOrderId() {
        return em.createQuery("SELECT e FROM Responsavel e ORDER BY e.idResponsavel").getResultList();
    }

    public List<String> listInOrderNomeStrings(String qualOrdem) {
        List<Responsavel> lf;
        if (qualOrdem.equals("id")) {
            lf = listInOrderId();
        } else {
            lf = listInOrderNome();
        }

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
            ls.add(lf.get(i).getIdResponsavel() + "-" + lf.get(i).getNome());
        }
        return ls;
    }
}
