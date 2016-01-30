package br.com.ns;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.ns.business.CepBeanTest;
import br.com.ns.business.EnderecoBeanTest;

/**
 * The Class EnderecoTestExecutor.
 */
@RunWith(Suite.class)
@SuiteClasses({ CepBeanTest.class, EnderecoBeanTest.class })
public class EnderecoTestExecutor {

}
