/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasserver;

public class Tapper {
    private Integer id;
    private String firstName, lastName;
    public Tapper(Integer id, String firstName, String lastName)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Tapper()
    {}
    public Integer getId()
    {
        return this.id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return this.lastName;
    }


}
