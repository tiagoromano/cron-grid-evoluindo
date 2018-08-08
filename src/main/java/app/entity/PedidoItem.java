package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PEDIDOITEM
 * @generated
 */
@Entity
@Table(name = "\"PEDIDOITEM\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PedidoItem")
public class PedidoItem implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "attribute_01", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_01;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pedido", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Pedido pedido;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataPedido", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataPedido;

  /**
  * @generated
  */
  @Column(name = "campo2", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo2;

  /**
  * @generated
  */
  @Column(name = "campo3", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo3;

  /**
  * @generated
  */
  @Column(name = "campo4", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo4;

  /**
  * @generated
  */
  @Column(name = "campo5", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo5;

  /**
  * @generated
  */
  @Column(name = "campo6", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo6;

  /**
  * @generated
  */
  @Column(name = "campo7", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo7;

  /**
  * @generated
  */
  @Column(name = "campo8", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo8;

  /**
  * @generated
  */
  @Column(name = "campo9", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo9;

  /**
  * @generated
  */
  @Column(name = "campo10", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo10;

  /**
  * @generated
  */
  @Column(name = "campo11", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo11;

  /**
  * @generated
  */
  @Column(name = "campo12", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo12;

  /**
  * @generated
  */
  @Column(name = "campo13", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo13;

  /**
  * @generated
  */
  @Column(name = "campo14", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo14;

  /**
   * Construtor
   * @generated
   */
  public PedidoItem(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public PedidoItem setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém attribute_01
   * return attribute_01
   * @generated
   */
  
  public java.lang.String getAttribute_01(){
    return this.attribute_01;
  }

  /**
   * Define attribute_01
   * @param attribute_01 attribute_01
   * @generated
   */
  public PedidoItem setAttribute_01(java.lang.String attribute_01){
    this.attribute_01 = attribute_01;
    return this;
  }

  /**
   * Obtém pedido
   * return pedido
   * @generated
   */
  
  public Pedido getPedido(){
    return this.pedido;
  }

  /**
   * Define pedido
   * @param pedido pedido
   * @generated
   */
  public PedidoItem setPedido(Pedido pedido){
    this.pedido = pedido;
    return this;
  }

  /**
   * Obtém dataPedido
   * return dataPedido
   * @generated
   */
  
  public java.util.Date getDataPedido(){
    return this.dataPedido;
  }

  /**
   * Define dataPedido
   * @param dataPedido dataPedido
   * @generated
   */
  public PedidoItem setDataPedido(java.util.Date dataPedido){
    this.dataPedido = dataPedido;
    return this;
  }

  /**
   * Obtém campo2
   * return campo2
   * @generated
   */
  
  public java.lang.String getCampo2(){
    return this.campo2;
  }

  /**
   * Define campo2
   * @param campo2 campo2
   * @generated
   */
  public PedidoItem setCampo2(java.lang.String campo2){
    this.campo2 = campo2;
    return this;
  }

  /**
   * Obtém campo3
   * return campo3
   * @generated
   */
  
  public java.lang.String getCampo3(){
    return this.campo3;
  }

  /**
   * Define campo3
   * @param campo3 campo3
   * @generated
   */
  public PedidoItem setCampo3(java.lang.String campo3){
    this.campo3 = campo3;
    return this;
  }

  /**
   * Obtém campo4
   * return campo4
   * @generated
   */
  
  public java.lang.String getCampo4(){
    return this.campo4;
  }

  /**
   * Define campo4
   * @param campo4 campo4
   * @generated
   */
  public PedidoItem setCampo4(java.lang.String campo4){
    this.campo4 = campo4;
    return this;
  }

  /**
   * Obtém campo5
   * return campo5
   * @generated
   */
  
  public java.lang.String getCampo5(){
    return this.campo5;
  }

  /**
   * Define campo5
   * @param campo5 campo5
   * @generated
   */
  public PedidoItem setCampo5(java.lang.String campo5){
    this.campo5 = campo5;
    return this;
  }

  /**
   * Obtém campo6
   * return campo6
   * @generated
   */
  
  public java.lang.String getCampo6(){
    return this.campo6;
  }

  /**
   * Define campo6
   * @param campo6 campo6
   * @generated
   */
  public PedidoItem setCampo6(java.lang.String campo6){
    this.campo6 = campo6;
    return this;
  }

  /**
   * Obtém campo7
   * return campo7
   * @generated
   */
  
  public java.lang.String getCampo7(){
    return this.campo7;
  }

  /**
   * Define campo7
   * @param campo7 campo7
   * @generated
   */
  public PedidoItem setCampo7(java.lang.String campo7){
    this.campo7 = campo7;
    return this;
  }

  /**
   * Obtém campo8
   * return campo8
   * @generated
   */
  
  public java.lang.String getCampo8(){
    return this.campo8;
  }

  /**
   * Define campo8
   * @param campo8 campo8
   * @generated
   */
  public PedidoItem setCampo8(java.lang.String campo8){
    this.campo8 = campo8;
    return this;
  }

  /**
   * Obtém campo9
   * return campo9
   * @generated
   */
  
  public java.lang.String getCampo9(){
    return this.campo9;
  }

  /**
   * Define campo9
   * @param campo9 campo9
   * @generated
   */
  public PedidoItem setCampo9(java.lang.String campo9){
    this.campo9 = campo9;
    return this;
  }

  /**
   * Obtém campo10
   * return campo10
   * @generated
   */
  
  public java.lang.String getCampo10(){
    return this.campo10;
  }

  /**
   * Define campo10
   * @param campo10 campo10
   * @generated
   */
  public PedidoItem setCampo10(java.lang.String campo10){
    this.campo10 = campo10;
    return this;
  }

  /**
   * Obtém campo11
   * return campo11
   * @generated
   */
  
  public java.lang.String getCampo11(){
    return this.campo11;
  }

  /**
   * Define campo11
   * @param campo11 campo11
   * @generated
   */
  public PedidoItem setCampo11(java.lang.String campo11){
    this.campo11 = campo11;
    return this;
  }

  /**
   * Obtém campo12
   * return campo12
   * @generated
   */
  
  public java.lang.String getCampo12(){
    return this.campo12;
  }

  /**
   * Define campo12
   * @param campo12 campo12
   * @generated
   */
  public PedidoItem setCampo12(java.lang.String campo12){
    this.campo12 = campo12;
    return this;
  }

  /**
   * Obtém campo13
   * return campo13
   * @generated
   */
  
  public java.lang.String getCampo13(){
    return this.campo13;
  }

  /**
   * Define campo13
   * @param campo13 campo13
   * @generated
   */
  public PedidoItem setCampo13(java.lang.String campo13){
    this.campo13 = campo13;
    return this;
  }

  /**
   * Obtém campo14
   * return campo14
   * @generated
   */
  
  public java.lang.String getCampo14(){
    return this.campo14;
  }

  /**
   * Define campo14
   * @param campo14 campo14
   * @generated
   */
  public PedidoItem setCampo14(java.lang.String campo14){
    this.campo14 = campo14;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PedidoItem object = (PedidoItem)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
