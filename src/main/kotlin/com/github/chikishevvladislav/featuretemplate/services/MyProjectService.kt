package com.github.chikishevvladislav.featuretemplate.services

import com.intellij.openapi.project.Project
import com.github.chikishevvladislav.featuretemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
