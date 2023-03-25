package br.com.precisomtx.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias_produtos")
public class CategoriaProduto {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name = "Id", nullable = false)
			private int Id;
			
			@Column(name = "CateogriaDescricao", nullable = false)
			private String Descricao;

			public CategoriaProduto() {
				super();
			}

			public int getId() {
				return Id;
			}

			public void setId(int id) {
				Id = id;
			}

			public String getDescricao() {
				return Descricao;
			}

			public void setDescricao(String descricao) {
				Descricao = descricao;
			}
			
			
}
