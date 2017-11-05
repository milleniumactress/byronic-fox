/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.bullet.control.CharacterControl;
import com.jme3.input.ChaseCamera;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

/**
 *
 * @author Levint
 */
public class Fox extends SimpleApplication {
    //character
    CharacterControl character;
    Node model;
    //temp vectors
    Vector3f walkDirection = new Vector3f();
    //camera
    boolean left = false, right = false, up = false, down = false;
    ChaseCamera chaseCam;

    @Override
    public void simpleInitApp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
