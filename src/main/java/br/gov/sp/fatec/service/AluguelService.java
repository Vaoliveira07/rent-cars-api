package br.gov.sp.fatec.service;

import br.gov.sp.fatec.domain.request.AluguelRequest;
import br.gov.sp.fatec.domain.request.AluguelUpdateRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
import java.util.List;

@Service
public class AluguelService {
    @Autowired
    private AluguelRepository aluguelRepository;

    public Aluguel save(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public Optional<Aluguel> findById(Long id) {
        return aluguelRepository.findById(id);
    }

    public List<Aluguel> findAll() {
        return aluguelRepository.findAll();
    }

    public void deleteById(Long id) {
        aluguelRepository.deleteById(id);
    }
}
