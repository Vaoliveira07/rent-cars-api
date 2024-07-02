package br.gov.sp.fatec.service;

import br.gov.sp.fatec.domain.request.CarroRequest;
import br.gov.sp.fatec.domain.request.CarroUpdateRequest;
import br.gov.sp.fatec.domain.response.CarroResponse;
import java.util.List;

@Service
public class CarroService {
    @Autowired
    private CarroRepository carroRepository;

    public Carro save(Carro carro) {
        return carroRepository.save(carro);
    }

    public Optional<Carro> findById(Long id) {
        return carroRepository.findById(id);
    }

    public List<Carro> findAll() {
        return carroRepository.findAll();
    }

    public void deleteById(Long id) {
        carroRepository.deleteById(id);
    }
}