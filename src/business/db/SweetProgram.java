package business.db;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SweetProgram entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sweet_program", catalog = "sweet")
public class SweetProgram implements java.io.Serializable
{

	// Fields

	private Integer id;
	private String programName;
	private Integer parent;
	private Timestamp timeCreate;

	// Constructors

	/** default constructor */
	public SweetProgram()
	{
	}

	/** full constructor */
	public SweetProgram(String programName, Integer parent, Timestamp timeCreate)
	{
		this.programName = programName;
		this.parent = parent;
		this.timeCreate = timeCreate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	@Column(name = "programName", length = 64)
	public String getProgramName()
	{
		return this.programName;
	}

	public void setProgramName(String programName)
	{
		this.programName = programName;
	}

	@Column(name = "parent")
	public Integer getParent()
	{
		return this.parent;
	}

	public void setParent(Integer parent)
	{
		this.parent = parent;
	}

	@Column(name = "timeCreate", length = 0)
	public Timestamp getTimeCreate()
	{
		return this.timeCreate;
	}

	public void setTimeCreate(Timestamp timeCreate)
	{
		this.timeCreate = timeCreate;
	}

}