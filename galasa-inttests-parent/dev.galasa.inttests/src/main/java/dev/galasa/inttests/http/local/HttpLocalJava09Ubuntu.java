/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2021.
 */
package dev.galasa.inttests.http.local;

import dev.galasa.galasaecosystem.IGenericEcosystem;
import dev.galasa.galasaecosystem.ILocalEcosystem;
import dev.galasa.galasaecosystem.LocalEcosystem;
import dev.galasa.inttests.http.AbstractHttpLocal;
import dev.galasa.java.JavaVersion;
import dev.galasa.java.ubuntu.IJavaUbuntuInstallation;
import dev.galasa.java.ubuntu.JavaUbuntuInstallation;
import dev.galasa.linux.ILinuxImage;
import dev.galasa.linux.LinuxImage;
import dev.galasa.linux.OperatingSystem;

// Withdrawn from service because the certificate database of Java 11 is not maintained
public class HttpLocalJava09Ubuntu extends AbstractHttpLocal {

    @LocalEcosystem(linuxImageTag = "PRIMARY")
    public ILocalEcosystem ecosystem;
    
    @LinuxImage(operatingSystem = OperatingSystem.ubuntu)
    public ILinuxImage linuxImage;
    
    @JavaUbuntuInstallation(javaVersion = JavaVersion.v9)
    public IJavaUbuntuInstallation java;

    @Override
    protected IGenericEcosystem getEcosystem() {
        return this.ecosystem;
    }

}
