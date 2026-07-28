(ns kotoba.capability.gpu.set-position
  "Importable contract for gpu/set-position.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:gpu-set-position}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid nil, :capability/repository "kotoba-lang/capability-gpu-set-position", :capability/id "gpu/set-position", :capability/effects #{:device-write}, :capability/provider-status :contract-only})
