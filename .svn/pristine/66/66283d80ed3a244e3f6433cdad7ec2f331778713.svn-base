package business.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SwetTree entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sweet_tree", catalog = "sweet")
public class SweetTree implements java.io.Serializable
{

	// Fields

	private Long id;
	private String code;
	private String parent;
	private String name;

	// Constructors

	/** default constructor */
	public SweetTree()
	{
	}

	/** full constructor */
	public SweetTree(String code, String parent, String name)
	{
		this.code = code;
		this.parent = parent;
		this.name = name;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId()
	{
		return this.id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	@Column(name = "code", length = 56)
	public String getCode()
	{
		return this.code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	@Column(name = "parent", length = 56)
	public String getParent()
	{
		return this.parent;
	}

	public void setParent(String parent)
	{
		this.parent = parent;
	}

	@Column(name = "name", length = 56)
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}