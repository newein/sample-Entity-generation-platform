package com.rapid.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.tcs.amsapp.Entities.Client;

/**
 * Entity implementation class for Entity: Cart
 *
 */
@Entity
@Table(name="cart", schema="goshop_schema")

public class Cart implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Cart() {
		super();
	}
	
	@Id
	@TableGenerator(name = "Cart_key_Incrementor", table = "Id_Generator", schema = "goshop_schema", 
		initialValue = 1, pkColumnName = "gen_name", valueColumnName = "gen_value", 
		pkColumnValue = "cart_id_gen", allocationSize = 1)
	@GeneratedValue(strategy = TABLE, generator = "Cart_key_Incrementor")
	@Column( name = "cart_id" )
	private long cartId;

	@ManyToOne
	@JoinColumn(name="user_id")
	private UserInfo owner_id;

	@ManyToOne
	@JoinColumn(name="user_id")
	private UserInfo buyer_id;
	
	@ElementCollection
	@CollectionTable(name="cart_products",joinColumns=@JoinColumn(name="cart_id"))
	private List<ProductList> productList = new ArrayList<ProductList>();
   
	@Column(name = "cart_type")
	private String cartType;
	
	@Column(name="is_cart_active")
	private boolean isCartActive;
	
	
	@Version
    private Long version;

}
