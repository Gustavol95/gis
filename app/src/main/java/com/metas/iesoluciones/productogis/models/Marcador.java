package com.metas.iesoluciones.productogis.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by iedeveloper on 14/07/17.
 */

@Entity
public class Marcador {

    @SerializedName("id")
    @Expose
    @Id
    private Integer id;
    @SerializedName("titulo")
    @Expose
    private String titulo;
    @SerializedName("snippet")
    @Expose
    private String snippet;
    @SerializedName("latitud")
    @Expose
    private Double latitud;
    @SerializedName("longitud")
    @Expose
    private Double longitud;
    @SerializedName("draggable")
    @Expose
    private Integer draggable;
    @SerializedName("flat")
    @Expose
    private Integer flat;
    @SerializedName("rotation")
    @Expose
    private Integer rotation;
    @SerializedName("z_index")
    @Expose
    private Double zIndex;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("deleted_at")
    @Expose
    private String deletedAt;

    @Generated(hash = 1988174645)
    public Marcador(Integer id, String titulo, String snippet, Double latitud,
            Double longitud, Integer draggable, Integer flat, Integer rotation,
            Double zIndex, String icon, Integer type, String createdAt,
            String updatedAt, String deletedAt) {
        this.id = id;
        this.titulo = titulo;
        this.snippet = snippet;
        this.latitud = latitud;
        this.longitud = longitud;
        this.draggable = draggable;
        this.flat = flat;
        this.rotation = rotation;
        this.zIndex = zIndex;
        this.icon = icon;
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    @Generated(hash = 654831970)
    public Marcador() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
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

    public Integer getDraggable() {
        return draggable;
    }

    public void setDraggable(Integer draggable) {
        this.draggable = draggable;
    }

    public Integer getFlat() {
        return flat;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public Double getZIndex() {
        return zIndex;
    }

    public void setZIndex(Double zIndex) {
        this.zIndex = zIndex;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        return "Marcador{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", snippet='" + snippet + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", draggable=" + draggable +
                ", flat=" + flat +
                ", rotation=" + rotation +
                ", zIndex=" + zIndex +
                ", icon=" + icon +
                ", type=" + type +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", deletedAt=" + deletedAt +
                '}';
    }
}
