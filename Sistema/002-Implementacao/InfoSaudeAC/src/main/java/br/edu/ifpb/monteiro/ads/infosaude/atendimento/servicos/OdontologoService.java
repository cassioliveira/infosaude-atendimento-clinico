package br.edu.ifpb.monteiro.ads.infosaude.atendimento.servicos;

import br.edu.ifpb.monteiro.ads.infosaude.atendimento.dao.OdontologoDao;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.excecoes.UBSException;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo.Odontologo;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.util.jpa.Transactional;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Cássio Oliveira
 */
public class OdontologoService {

    @Inject
    private OdontologoDao odontologoDAO;

    @Transactional
    public void save(Odontologo odontologo) throws UBSException{
        odontologoDAO.salvar(odontologo);
    }

    @Transactional
    public void delete(Odontologo odontologo)  throws UBSException{
        odontologo = findById(odontologo.getId());
        odontologoDAO.delete(odontologo);
    }

    public List<Odontologo> findAll() {
        return odontologoDAO.findAll();
    }

    public Odontologo findById(Long id) throws UBSException {
        return odontologoDAO.findById(id);
    }

}
