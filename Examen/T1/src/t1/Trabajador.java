/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1;

/**
 *
 * @author ACER
 */
public class Trabajador
{
    private String nombres;
    private String tipodoc;
    private String numdoc;
    private String reglab;
    private String fondpen;
    private Boolean hij;
    private String hortrab;
    private Double sueld;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        if (tipodoc.equalsIgnoreCase("DNI")||tipodoc.equalsIgnoreCase("RT"))
        {
            this.tipodoc=tipodoc;
        }
        else
        {
            System.out.println(" Tipo de documento erróneo");
        }
    }

    public String getNumdoc() {
        return numdoc;
    }

    public void setNumdoc(String numdoc) {
        if(this.tipodoc.equalsIgnoreCase("DNI"))
        {
            if (numdoc.length()==8)
            {
                this.numdoc=numdoc;
            }
            else 
            {
                System.out.println(" La cantidad de dígitos es errónea");
            }
        }
        else if(this.tipodoc.equalsIgnoreCase("RT"))
        {
            if (numdoc.length()==11)
            {
                this.numdoc = numdoc;
            }
            else
            {
                System.out.println(" La cantidad de digitos es errónea");
            }
        }
        else
        {
            System.out.println(" Tipo de documento Erróneo");
        }
    }

    public String getReglab() {
        return reglab;
    }

    public void setReglab(String reglab) 
    {
        if(reglab.equalsIgnoreCase("728")|| reglab.equalsIgnoreCase("LS"))
        {
            this.reglab=reglab;
        }
        else
        {
            System.out.println(" El régimen laboral es erróneo");
        }
    }

    public String getFondpen() {
        return fondpen;
    }

    public void setFondpen(String fondpen) {
        if (fondpen.equalsIgnoreCase("Integra")||fondpen.equalsIgnoreCase("Prima"))
        {
            this.fondpen=fondpen;
        }
        else if(fondpen.equalsIgnoreCase("Habitat")||fondpen.equalsIgnoreCase("ONP"))
        {
            this.fondpen=fondpen;
        }
        else
        {
            System.out.println(" El tipo de fondo de pensiones es incorrecto");
        }
    }

    public Boolean getHij() {
        return hij;
    }

    public void setHij(Boolean hij) {
        this.hij = hij;
    }

    public String getHortrab() {
        return hortrab;
    }

    public void setHortrab(String hortrab) {
        this.hortrab = hortrab;
    }

    public Double getSueld() {
        return sueld;
    }

    public void setSueld(Double sueld) {
        this.sueld = sueld;
    }
    public double descuenPen()
    {
        if (this.fondpen == null) 
            return 0.0;
        
        if (this.fondpen.equalsIgnoreCase("ONP")) {
            return this.sueld * 0.13;
        }
        else if(this.fondpen.equalsIgnoreCase("Integra")) 
        {
            return this.sueld * 0.121; 
        }
        else if(this.fondpen.equalsIgnoreCase("Prima"))
        {
            return this.sueld * 0.125;
        }
        else if(this.fondpen.equalsIgnoreCase("Habitat"))
        {
            return this.sueld * 0.127;
        }
        return 0.0;
    }
    public double CalcularSueldo() {
        double bonos = 0.0;

        if (this.reglab != null && this.reglab.equalsIgnoreCase("728")) 
        {
            if (this.hij != null && this.hij == true) {
                bonos += 50; // Profesor en este caso diremos que el bono por tener hijo es de 50 soles
            }

            if (this.hortrab != null && this.hortrab.equalsIgnoreCase("Nocturno")) {
                bonos += (this.sueld * 0.12);//profesor en este caso simularemos que es un bono del 12%
            }
        }

        return this.sueld + bonos - descuenPen();//con esto sabremos cual es el sueldo total
    }
}
