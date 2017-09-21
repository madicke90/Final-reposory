package sn.groupidyal.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

@Entity
public class Role extends SerializableSerializer {

	@Id
	private String nomRole;
	private String description;
	@ManyToMany(mappedBy="roles")
	private Collection<Utilisateur> utilisateurs;

}
