/*
 * Copyright (c) 2013 Cosmin Stejerean, Karl Heinz Marbaise, and contributors.
 *
 * Distributed under the MIT license: http://opensource.org/licenses/MIT
 */

package com.offbytwo.jenkins.model;

import java.util.List;

public class QueueItem extends BaseModel {

    private List<QueueItemActions> actions;

    private boolean blocked;

    private boolean buildable;

    private Long id;

    private Long inQueueSince;

    private String params;

    private boolean stuck;

    private QueueTask task;

    private String url;

    private String why;

    private boolean cancelled;

    private Executable executable;

    public List<QueueItemActions> getActions() {
        return actions;
    }

    public void setActions(List<QueueItemActions> actions) {
        this.actions = actions;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isBuildable() {
        return buildable;
    }

    public void setBuildable(boolean buildable) {
        this.buildable = buildable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInQueueSince() {
        return inQueueSince;
    }

    public void setInQueueSince(Long inQueueSince) {
        this.inQueueSince = inQueueSince;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public boolean isStuck() {
        return stuck;
    }

    public QueueTask getTask() {
        return task;
    }

    public void setTask(QueueTask task) {
        this.task = task;
    }

    public void setStuck(boolean stuck) {
        this.stuck = stuck;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Executable getExecutable() {
        return executable;
    }

    public void setExecutable(Executable executable) {
        this.executable = executable;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((actions == null) ? 0 : actions.hashCode());
        result = prime * result + (blocked ? 1231 : 1237);
        result = prime * result + (buildable ? 1231 : 1237);
        result = prime * result + (cancelled ? 1231 : 1237);
        result = prime * result + ((executable == null) ? 0 : executable.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((inQueueSince == null) ? 0 : inQueueSince.hashCode());
        result = prime * result + ((params == null) ? 0 : params.hashCode());
        result = prime * result + (stuck ? 1231 : 1237);
        result = prime * result + ((task == null) ? 0 : task.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        result = prime * result + ((why == null) ? 0 : why.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        QueueItem other = (QueueItem) obj;
        if (actions == null) {
            if (other.actions != null)
                return false;
        } else if (!actions.equals(other.actions))
            return false;
        if (blocked != other.blocked)
            return false;
        if (buildable != other.buildable)
            return false;
        if (cancelled != other.cancelled)
            return false;
        if (executable == null) {
            if (other.executable != null)
                return false;
        } else if (!executable.equals(other.executable))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (inQueueSince == null) {
            if (other.inQueueSince != null)
                return false;
        } else if (!inQueueSince.equals(other.inQueueSince))
            return false;
        if (params == null) {
            if (other.params != null)
                return false;
        } else if (!params.equals(other.params))
            return false;
        if (stuck != other.stuck)
            return false;
        if (task == null) {
            if (other.task != null)
                return false;
        } else if (!task.equals(other.task))
            return false;
        if (url == null) {
            if (other.url != null)
                return false;
        } else if (!url.equals(other.url))
            return false;
        if (why == null) {
            if (other.why != null)
                return false;
        } else if (!why.equals(other.why))
            return false;
        return true;
    }

}
