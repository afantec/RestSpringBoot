package br.com.erudio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converter.ConverterNumber;
import br.com.erudio.exception.UnsuportedMathOperationException;

@RestController
public class MathController {
	
	private ConverterNumber converter = new ConverterNumber();
	
	@RequestMapping(value = "/soma/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double soma(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!converter.isNumeric(numberOne) || !converter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico.");
		}
		
		Double retorno = converter.convertToDouble(numberOne) + converter.convertToDouble(numberTwo);
		return retorno;
		
	}
	
	@RequestMapping(value = "/subtracao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtracao(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!converter.isNumeric(numberOne) || !converter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico.");
		}
		
		Double retorno = converter.convertToDouble(numberOne) - converter.convertToDouble(numberTwo);
		return retorno;
		
	}
	
	@RequestMapping(value = "/multiplicacao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplicacao(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!converter.isNumeric(numberOne) || !converter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico.");
		}
		
		Double retorno = converter.convertToDouble(numberOne) * converter.convertToDouble(numberTwo);
		return retorno;
	}
	
	@RequestMapping(value = "/divisao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double divisao(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!converter.isNumeric(numberOne) || !converter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico.");
		}
		
		Double retorno = converter.convertToDouble(numberOne) / converter.convertToDouble(numberTwo);
		return retorno;
	}
	
	@RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double media(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!converter.isNumeric(numberOne) || !converter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico.");
		}
		
		Double retorno = (converter.convertToDouble(numberOne) + converter.convertToDouble(numberTwo)) / 2;
		return retorno;
	}
	
	@RequestMapping(value = "/raiz/{numberOne}", method = RequestMethod.GET)
	public Double raiz(@PathVariable("numberOne") String numberOne) throws Exception {
		if(!converter.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico.");
		}
		
		Double retorno = Math.sqrt(converter.convertToDouble(numberOne));
		return retorno;
	}

}
