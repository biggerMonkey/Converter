package com.github.biggermonkey.converter.services

import com.intellij.openapi.project.Project
import com.github.biggermonkey.converter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
