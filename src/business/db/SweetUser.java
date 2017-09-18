package business.db;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SweetUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sweet_user", catalog = "sweet")
public class SweetUser implements java.io.Serializable
{

	// Fields

	private Long id;
	private String guid;
	private String password;
	private String store;
	private String thumb;
	private Boolean flagDeleted;
	private Timestamp timeDeleted;

	// Constructors

	/** default constructor */
	public SweetUser()
	{
	}

	/** minimal constructor */
	public SweetUser(Long id)
	{
		this.id = id;
	}

	/** full constructor */
	public SweetUser(Long id, String guid, String password, String store,
			String thumb, Boolean flagDeleted, Timestamp timeDeleted)
	{
		this.id = id;
		this.guid = guid;
		this.password = password;
		this.store = store;
		this.thumb = thumb;
		this.flagDeleted = flagDeleted;
		this.timeDeleted = timeDeleted;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Long getId()
	{
		return this.id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	@Column(name = "guid", length = 64)
	public String getGuid()
	{
		return this.guid;
	}

	public void setGuid(String guid)
	{
		this.guid = guid;
	}

	@Column(name = "password", length = 64)
	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Column(name = "store", length = 128)
	public String getStore()
	{
		return this.store;
	}

	public void setStore(String store)
	{
		this.store = store;
	}

	@Column(name = "thumb", length = 128)
	public String getThumb()
	{
		return this.thumb;
	}

	public void setThumb(String thumb)
	{
		this.thumb = thumb;
	}

	@Column(name = "flagDeleted")
	public Boolean getFlagDeleted()
	{
		return this.flagDeleted;
	}

	public void setFlagDeleted(Boolean flagDeleted)
	{
		this.flagDeleted = flagDeleted;
	}

	@Column(name = "timeDeleted", length = 0)
	public Timestamp getTimeDeleted()
	{
		return this.timeDeleted;
	}

	public void setTimeDeleted(Timestamp timeDeleted)
	{
		this.timeDeleted = timeDeleted;
	}

}