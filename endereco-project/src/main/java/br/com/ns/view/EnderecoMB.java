package br.com.ns.view;

import java.util.logging.Level;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import br.com.ns.business.CepBean;
import br.com.ns.business.EnderecoBean;
import br.com.ns.business.exception.BusinessException;
import br.com.ns.model.Cep;
import br.com.ns.model.Endereco;
import br.com.ns.util.Constantes;
import br.com.ns.view.base.BaseMB;

/**
 * The Class EnderecoMB.
 */
@Named
@ViewScoped
public class EnderecoMB extends BaseMB {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1810139369049097096L;

	/** The cep bean. */
	@Inject
	private CepBean cepBean;

	/** The endereco bean. */
	@Inject
	private EnderecoBean enderecoBean;

	/** The endereco. */
	private Endereco endereco;

	/**
	 * Inits the.
	 */
	@PostConstruct
	public void init() {
		this.endereco = new Endereco();
		this.endereco.setCep(new Cep());
	}

	/**
	 * Consulta cep.
	 */
	public void consultaCep() {
		String numeroCep = this.endereco.getCep().getNumero();

		String defaultURL = Faces.getRequestBaseURL();
		String urlServico = Faces.getInitParameter(Constantes.SERVICO_CONSULTA_CEP_URL_CONTEXT_PARAM);
		urlServico = defaultURL + urlServico;

		try {
			Cep cep = this.cepBean.consultaNumeroCep(urlServico, numeroCep);
			this.endereco.setCep(cep);

		} catch (BusinessException e) {
			super.getLogger().log(Level.SEVERE, e.getMessage(), e);
			this.endereco.setCep(new Cep(numeroCep));
			Messages.addError(null, e.getMessage());

		} catch (Exception e) {
			super.getLogger().log(Level.SEVERE, e.getMessage(), e);
			this.endereco.setCep(new Cep());
			Messages.addError(null, super.getResourceMessage("msg.erro.padrao"));
		}
	}

	/**
	 * Salva.
	 */
	public void salvaEndereco() {
		try {
			Cep cep = this.endereco.getCep();
			if (cep.getId() != null) {
				cep = this.cepBean.recuperaPorId(cep.getId());
				this.endereco.setCep(cep);
			}

			this.endereco = this.enderecoBean.salva(this.endereco);
			Messages.addInfo(null, super.getResourceMessage("msg.sucesso.cadastro.endereco"), this.endereco.getId());
			this.init();

		} catch (Exception e) {
			super.getLogger().log(Level.SEVERE, e.getMessage(), e);
			Messages.addError(null, super.getResourceMessage("msg.erro.padrao"));
		}
	}

	/**
	 * Pesquisa endereco.
	 */
	public void pesquisaEndereco() {
		Integer id = this.endereco.getId();
		if (id != null) {
			this.endereco = this.enderecoBean.recuperaPorId(id);

			if (this.endereco == null) {
				Messages.addError(null, super.getResourceMessage("msg.erro.endereco.nao.encontrado"));
				this.init();
			}
		}
	}

	/**
	 * Exclui endereco.
	 */
	public void excluiEndereco() {
		try {
			this.enderecoBean.remove(this.endereco);
			Messages.addInfo(null, super.getResourceMessage("msg.sucesso.remocao.endereco"));
			this.init();

		} catch (Exception e) {
			super.getLogger().log(Level.SEVERE, e.getMessage(), e);
			Messages.addError(null, super.getResourceMessage("msg.erro.padrao"));
		}
	}

	/**
	 * Gets the endereco.
	 *
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * Sets the endereco.
	 *
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
