package sn.groupidyal.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

@Entity
public class Utilisateur extends SerializableSerializer {

	@Id
	private String nomUtilisateur;
	private String password;@ManyToMany @JoinTable(name="utilisateurs_roles",@JoinColumns=
	{@JoinColumn(name="nomUtilisateur")},inverseJoinColumns=
	{@JoinColumn(name="nomRole")})

	private Collection<Role> roles;

}
