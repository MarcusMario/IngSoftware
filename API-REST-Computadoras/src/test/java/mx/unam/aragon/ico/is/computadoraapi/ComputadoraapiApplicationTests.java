package mx.unam.aragon.ico.is.computadoraapi;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.repositories.ComputadoraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComputadoraapiApplicationTests {

	//Patron inversion de control
	@Autowired
	private ComputadoraRepository computadoraRepository;

	@Test
	void contextLoads() {
	}


	@Test
	void insertarComputadora(){
		Computadora computadora = new Computadora(0,"HP","pavillon 2000",null, 13000.0f);
		computadoraRepository.save(computadora) ;
	}

	@Test
	void leerComputadoraPorClave(){
		Long claveTmp= 2l; //pavillion3000
		Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp); //Se declara en la interfaz
		System.out.println(tmp);
	}


	@Test
	public void eliminarComputadora(){
		Long claveTmp = 2l;
		computadoraRepository.deleteById(claveTmp);
	}

	@Test
	public void actualizarComputadroa(){
		Long claveTmp=4l;
		Computadora tmp= computadoraRepository.findComputadoraByClave(claveTmp);
		tmp.setModelo("patito 3000");
		computadoraRepository.save(
				tmp
		);


	}


}
