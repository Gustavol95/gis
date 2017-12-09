package com.metas.iesoluciones.productogis.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by iedeveloper on 18/07/17.
 */

@Entity
public class Circulo {
    @Id
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("latitud")
    @Expose
    private Double latitud;
    @SerializedName("longitud")
    @Expose
    private Double longitud;
    @SerializedName("radio")
    @Expose
    private Double radio;
    @SerializedName("alpha")
    @Expose
    private Double alpha;
    @SerializedName("hue")
    @Expose
    private Integer hue;
    @SerializedName("saturation")
    @Expose
    private Float saturation;
    @SerializedName("value")
    @Expose
    private Float value;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("deleted_at")
    @Expose
    private String deletedAt;



    @Generated(hash = 795005066)
    public Circulo(Integer id, Double latitud, Double longitud, Double radio,
            Double alpha, Integer hue, Float saturation, Float value,
            String createdAt, String updatedAt, String deletedAt) {
        this.id = id;
        this.latitud = latitud;
        this.longitud = longitud;
        this.radio = radio;
        this.alpha = alpha;
        this.hue = hue;
        this.saturation = saturation;
        this.value = value;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    @Generated(hash = 1354664391)
    public Circulo() {
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getAlpha() {
        return alpha;
    }

    public void setAlpha(Double alpha) {
        this.alpha = alpha;
    }

    public Integer getHue() {
        return hue;
    }

    public void setHue(Integer hue) {
        this.hue = hue;
    }

    public Float getSaturation() {
        return saturation;
    }

    public void setSaturation(Float saturation) {
        this.saturation = saturation;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "id=" + id +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", radio=" + radio +
                ", alpha=" + alpha +
                ", hue=" + hue +
                ", saturation=" + saturation +
                ", value=" + value +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", deletedAt='" + deletedAt + '\'' +
                '}';
    }
}
