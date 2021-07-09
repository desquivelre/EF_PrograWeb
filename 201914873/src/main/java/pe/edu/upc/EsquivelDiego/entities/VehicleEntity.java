package pe.edu.upc.EsquivelDiego.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="VehicleEntity")
public class VehicleEntity {

	@Id
	@Column(name = "eridVehicle", nullable = false)
	private Integer eridVehicle;
	
	@NotEmpty(message = "license plate is required")
	@Column(name = "erLicensePlateVehicle", length = 100)
	private String erLicensePlateVehicle;
	
	@NotNull(message = "must be higher than 0")
	@Min(0)
	@Column(name = "ertareVehicle", length = 10)
	private Float ertareVehicle;
	
	@NotNull(message = "must be higher than 0")
	@Min(0)
	@Column(name = "erWeightLoadVehicle", length = 10)
	private Float erWeightLoadVehicle;

	public VehicleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleEntity(Integer eridVehicle,
			@NotEmpty(message = "license plate is required") String erLicensePlateVehicle,
			@NotNull(message = "must be higher than 0") @Min(0) Float ertareVehicle,
			@NotNull(message = "must be higher than 0") @Min(0) Float erWeightLoadVehicle) {
		super();
		this.eridVehicle = eridVehicle;
		this.erLicensePlateVehicle = erLicensePlateVehicle;
		this.ertareVehicle = ertareVehicle;
		this.erWeightLoadVehicle = erWeightLoadVehicle;
	}

	public Integer getEridVehicle() {
		return eridVehicle;
	}

	public void setEridVehicle(Integer eridVehicle) {
		this.eridVehicle = eridVehicle;
	}

	public String getErLicensePlateVehicle() {
		return erLicensePlateVehicle;
	}

	public void setErLicensePlateVehicle(String erLicensePlateVehicle) {
		this.erLicensePlateVehicle = erLicensePlateVehicle;
	}

	public Float getErtareVehicle() {
		return ertareVehicle;
	}

	public void setErtareVehicle(Float ertareVehicle) {
		this.ertareVehicle = ertareVehicle;
	}

	public Float getErWeightLoadVehicle() {
		return erWeightLoadVehicle;
	}

	public void setErWeightLoadVehicle(Float erWeightLoadVehicle) {
		this.erWeightLoadVehicle = erWeightLoadVehicle;
	}

	
	
	
	
	
}
