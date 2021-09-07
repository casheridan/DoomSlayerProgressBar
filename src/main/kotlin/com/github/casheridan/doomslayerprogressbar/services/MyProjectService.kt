package com.github.casheridan.doomslayerprogressbar.services

import com.intellij.openapi.project.Project
import com.github.casheridan.doomslayerprogressbar.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
