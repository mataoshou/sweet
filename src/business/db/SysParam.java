package business.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SysParam entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_param", catalog = "sweet")
public class SysParam implements java.io.Serializable
{

	// Fields

	private Long id;
	private String name;
	private String value;
	private String defval;

	// Constructors

	/** default constructor */
	public SysParam()
	{
	}

	/** full constructor */
	public SysParam(String name, String value, String defval)
	{
		this.name = name;
		this.value = value;
		this.defval = defval;
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

	@Column(name = "name", length = 32)
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column(name = "value", length = 128)
	public String getValue()
	{
		return this.value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	@Column(name = "defval", length = 128)
	public String getDefval()
	{
		return this.defval;
	}

	public void setDefval(String defval)
	{
		this.defval = defval;
	}

}