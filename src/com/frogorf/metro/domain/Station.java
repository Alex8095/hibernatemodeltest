/**
 * 
 */
package com.frogorf.metro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** @author Tsurkin Alex
 * @version */

@Entity
@Table(name = "station")
public class Station {

	@Id
	@Column
	private int id;

	public Station() {

	}
}
